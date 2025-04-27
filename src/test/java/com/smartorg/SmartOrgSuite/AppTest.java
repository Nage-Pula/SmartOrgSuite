package com.smartorg.SmartOrgSuite;
import com.smartorg.models.Employee;
import com.smartorg.models.Task;
import com.smartorg.services.TaskManager;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	void testAssignTask() {
		Employee employee = new Employee("E101", "Alice", "Tech");
		Task task = new Task("T001", "Fix Bug", "Tech", LocalDateTime.now().plusDays(1));

		employee.assignTask(task);

		assertEquals(1, employee.getAssignedTasks().size());
		assertEquals("Fix Bug", employee.getAssignedTasks().get(0).getTaskDescription());
	}
	  @Test
	    void testAssignTaskToEmployee() {
	        TaskManager manager = new TaskManager();
	        Employee e1 = new Employee("E101", "Alice", "Tech");
	        manager.addEmployee(e1);

	        Task task = new Task("T001", "Code Review", "Tech", LocalDateTime.now().plusDays(1));
	        manager.addTask(task);

	        manager.assignTasks();
	        manager.awaitTermination();

	        assertEquals(1, e1.getAssignedTasks().size());
	        assertEquals("Code Review", e1.getAssignedTasks().get(0).getTaskDescription());
	    }
}


