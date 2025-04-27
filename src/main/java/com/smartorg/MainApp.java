package com.smartorg;
import java.time.LocalDateTime;
import com.smartorg.models.Employee;
import com.smartorg.models.Task;
import com.smartorg.services.TaskManager;

public class MainApp {
	public static void main(String[] args) {
		try {    
			System.out.println("Welcome to SmartOrgSuite 🚀");

			TaskManager taskManager = new TaskManager();

			// Adding employees
			Employee e1 = new Employee("E101", "Nage", "Tech");
			Employee e2 = new Employee("E102", "Pula", "HR");
			Employee e3 = new Employee("E103", "Other", "Admin");

			taskManager.addEmployee(e1);
			taskManager.addEmployee(e2);
			taskManager.addEmployee(e3);

			// Adding tasks
			Task t1 = new Task("T001", "Fix backend bug", "Tech", LocalDateTime.now().plusDays(1));
			Task t2 = new Task("T002", "Conduct interview", "HR", LocalDateTime.now().plusDays(1));
			Task t3 = new Task("T003", "Organize files", "Admin", LocalDateTime.now().plusDays(1));
			Task t4 = new Task("T004", "Fix frontend bug", "Tech", LocalDateTime.now().plusDays(1));
			Task t5 = new Task("T005", "Prepare report", "HR", LocalDateTime.now().plusDays(1));
			Task t6 = new Task("T006", "Update database", "Tech", LocalDateTime.now().plusDays(1));
			Task t7 = new Task("T007", "Schedule meeting", "Admin", LocalDateTime.now().plusDays(1));
			Task t8 = new Task("T008", "Design UI", "Tech", LocalDateTime.now().plusDays(1));
			Task t9 = new Task("T009", "Create presentation", "HR", LocalDateTime.now().plusDays(1));
			Task t10 = new Task("T010", "Manage inventory", "Admin", LocalDateTime.now().plusDays(1));
			

			taskManager.addTask(t1);
			taskManager.addTask(t2);
			taskManager.addTask(t3);
			taskManager.addTask(t4);
			taskManager.addTask(t5);
			taskManager.addTask(t6);
			taskManager.addTask(t7);
			taskManager.addTask(t8);
			taskManager.addTask(t9);
			taskManager.addTask(t10);
			//Assign tasks to employees

			taskManager.assignTasks();

			//Add wait for threads to finish
			taskManager.awaitTermination();

			//Print Summary
			taskManager.printSummary();
		} catch (Exception e) {
			System.out.println("[Critical Error] Application failed: " + e.getMessage());
			e.printStackTrace();
		}
	}
}





