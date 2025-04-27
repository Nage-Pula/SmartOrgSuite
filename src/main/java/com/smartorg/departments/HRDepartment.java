package com.smartorg.departments;

public class HRDepartment extends BaseDepartment implements DepartmentsInterface {
	private static final String DEPARTMENT_NAME = "HR Department";
	private static final String DEPARTMENT_DESCRIPTION = "This is the HR Department";

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
		return "HR" + getDepartmentId();
	}

	@Override
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	@Override
	public void assignTasks() {
		System.out.println("Assigning tasks to HR Department");
	}

	@Override
	public void processTasks() {
		System.out.println("Processing tasks in HR Department");
	}

}
