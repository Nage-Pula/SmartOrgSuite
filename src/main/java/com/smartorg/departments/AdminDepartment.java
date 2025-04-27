package com.smartorg.departments;

public class AdminDepartment extends BaseDepartment implements DepartmentsInterface {
	private static final String DEPARTMENT_NAME = "Admin Department";
	private static final String DEPARTMENT_DESCRIPTION = "This is the Admin Department";

	@Override
	public String getDepartmentName() {
		return DEPARTMENT_NAME;
	}

	@Override
	public String getDepartmentDescription() {
		return DEPARTMENT_DESCRIPTION;
	}

	@Override
	public String getDepartmentCode() {
		return "AD" + getDepartmentId();
	}

	@Override
	public String getTodaysWork() {
		return "Complete your documents submission by EOD";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete documentation by EOD";
	}

	@Override
	public void assignTasks() {
		System.out.println("Assigning tasks to Admin Department");
	}

	@Override
	public void processTasks() {
		System.out.println("Processing tasks in Admin Department");

	}

}
