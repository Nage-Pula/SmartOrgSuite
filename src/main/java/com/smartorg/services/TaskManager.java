package com.smartorg.services;
import com.smartorg.models.Employee;
import com.smartorg.models.Task;
import com.smartorg.models.TaskStatus;
import com.smartorg.utils.FileLogger;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.*;

public class TaskManager {
	private Map<String, Employee> employees = new ConcurrentHashMap<>();
	private Queue<Task> taskQueue = new ConcurrentLinkedQueue<>();
	private ExecutorService executorService = Executors.newFixedThreadPool(3);

	public void addEmployee(Employee employee) {
		employees.put(employee.getEmployeeId(), employee);
	}

	public void addTask(Task task) {
		taskQueue.offer(task);
	}

	public void assignTasks() {
		try {
			while (!taskQueue.isEmpty()) {
				Task task = taskQueue.poll();
				Optional<Employee> employeeOpt = employees.values().stream()
						.filter(emp -> emp.getEmployeeDepartment().equalsIgnoreCase(task.getDepartmentName()))
						.findAny();

				if (employeeOpt.isPresent()) {
					Employee emp = employeeOpt.get();
					emp.assignTask(task);
					task.setTaskAssignedTo(emp.getEmployeeName());
					FileLogger.log("[ASSIGNED] Task: " + task.getTaskDescription() + " to: " + emp.getEmployeeName());
					executorService.submit(() -> executeTask(task));
				} else {
					FileLogger.log("[FAILED] No employee available for task: " + task.getTaskDescription());
					System.out.println("[Warning] No employee found for department: " + task.getDepartmentName());
				}
			}
		} catch (Exception e) {
			FileLogger.log("[ERROR] Error while assigning tasks: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private void executeTask(Task task) {
		try {
			if (task.getDeadline().isBefore(LocalDateTime.now())) {
				task.setTaskStatus(TaskStatus.FAILED);
				FileLogger.log("[DEADLINE MISSED] Task: " + task.getTaskDescription() + " was not started before deadline.");
				return;
			}

			task.setTaskStatus(TaskStatus.IN_PROGRESS);
			FileLogger.log("[STARTED] Task: " + task.getTaskDescription() + " by: " + task.getTaskAssignedTo());

			Thread.sleep(2000); // Simulate work

			task.setTaskStatus(TaskStatus.COMPLETED);
			FileLogger.log("[COMPLETED] Task: " + task.getTaskDescription() + " by: " + task.getTaskAssignedTo());
		} catch (InterruptedException e) {
			task.setTaskStatus(TaskStatus.FAILED);
			FileLogger.log("[FAILED] Task: " + task.getTaskDescription() + " due to interruption.");
			Thread.currentThread().interrupt(); // restore interrupt flag
		} catch (Exception ex) {
			task.setTaskStatus(TaskStatus.FAILED);
			FileLogger.log("[FAILED] Task: " + task.getTaskDescription() + " due to unexpected error: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	public void printSummary() {
		long totalTasks = employees.values().stream()
				.flatMap(emp -> emp.getAssignedTasks().stream())
				.count();

		long completedTasks = employees.values().stream()
				.flatMap(emp -> emp.getAssignedTasks().stream())
				.filter(task -> task.getTaskStatus() == TaskStatus.COMPLETED)
				.count();

		long failedTasks = employees.values().stream()
				.flatMap(emp -> emp.getAssignedTasks().stream())
				.filter(task -> task.getTaskStatus() == TaskStatus.FAILED)
				.count();

		System.out.println("\n--- Task Summary ---");
		System.out.println("Total Tasks Assigned: " + totalTasks);
		System.out.println("Total Tasks Completed: " + completedTasks);
		System.out.println("Total Tasks Failed: " + failedTasks);
		System.out.println("----------------------");
	}
	public void awaitTermination() {
		executorService.shutdown(); // 🛑 Stop accepting new tasks

		try {
			// 🕰️ Wait for existing tasks to complete
			if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
				System.out.println("Some tasks are taking too long... forcing shutdown!");
				executorService.shutdownNow(); // 🚨 Force shutdown
			}
		} catch (InterruptedException e) {
			System.out.println("Shutdown interrupted. Forcing shutdown...");
			executorService.shutdownNow();
			Thread.currentThread().interrupt();
		}
	}




}
