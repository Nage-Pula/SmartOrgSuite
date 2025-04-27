package com.smartorg.departments;
/**
 * This is an interface for the Departments module.
 * It defines the structure for department-related classes.
 */
public interface DepartmentsInterface {
	/**
	 * @return the name of the department
	 */
	String getDepartmentName();

	/**
	 * @return today's work
	 */
	String getTodaysWork();

	/**
	 * @return work deadline
	 */
	String getWorkDeadline();

	/**
	 * @return a message indicating if today is a holiday
	 */
	String isTodayAHoliday();
	/**
	 * This method can be used to assign specific tasks or responsibilities.
	 */
	void assignTasks();
	/**
	 * This method can be used to process or complete the assigned tasks.
	 */
	void processTasks();
}
