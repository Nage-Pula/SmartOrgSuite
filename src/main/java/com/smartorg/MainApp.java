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

			taskManager.addTask(t1);
			taskManager.addTask(t2);
			taskManager.addTask(t3);
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





