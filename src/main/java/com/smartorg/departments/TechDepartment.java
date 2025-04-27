package com.smartorg.departments;

public class TechDepartment extends BaseDepartment implements DepartmentsInterface {
	private static final String DEPARTMENT_NAME = "Tech Department";
	private static final String DEPARTMENT_DESCRIPTION = "This is the Tech Department";

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
		return "TE" + getDepartmentId();
	}

	@Override
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	@Override
	public void assignTasks() {
		System.out.println("Assigning tasks to Tech Department");
	}

	@Override
	public void processTasks() {
		System.out.println("Processing tasks in Tech Department");
	}

}
