package com.smartorg.models;

import java.util.*;

/**
 * This class represents an employee in the organization.
 */
public class Employee {
	private String employeeId;
	private String employeeName;
	private String employeeDepartment;
	private List<Task> assignedTasks;
	/**
	 * Constructor to initialize an employee with their ID, name, and department.
	 *
	 * @param employeeId       The unique identifier for the employee.
	 * @param employeeName     The name of the employee.
	 * @param employeeDepartment The department of the employee.
	 */
	public Employee(String employeeId, String employeeName, String employeeDepartment) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.assignedTasks = new ArrayList<>();
	}

	/**
	 * Sets the list of tasks assigned to the employee.
	 *
	 * @param assignedTasks The list of tasks to be assigned to the employee.
	 */
	public void assignTask(Task task) {
		assignedTasks.add(task);
	}

	/**
	 * Setter and Getter methods for employeeId, employeeName, employeeDepartment, and assignedTasks.
	 * @return
	 */
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	public List<Task> getAssignedTasks() {
		return assignedTasks;
	}
}
