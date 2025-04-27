package com.smartorg.departments;

public abstract class BaseDepartment {
	public abstract String getDepartmentName();
	public abstract String getTodaysWork();
	public abstract String getWorkDeadline();

	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
	public String getDepartmentDescription() {
		return null;
	}
	public String getDepartmentCode() {
		return null;
	}
	public int getDepartmentId() {
		return 0;
	}

}
