package com.smartorg.models;

import java.time.LocalDateTime;

public class Task {
	private String TaskId;
	private String TaskDescription;
	private TaskStatus TaskStatus;
	private String TaskAssignedTo;
	private String departmentName;
	private LocalDateTime deadline;
	
	public Task(String taskId, String taskDescription, /*String taskStatus, String taskAssignedTo,*/ String departmentName,
			LocalDateTime deadline) {
		super();
		TaskId = taskId;
		TaskDescription = taskDescription;
		/* TaskStatus = taskStatus;
		TaskAssignedTo = taskAssignedTo; */
		this.departmentName = departmentName;
		this.deadline = deadline;
	}

	public String getTaskId() {
		return TaskId;
	}

	public void setTaskId(String taskId) {
		TaskId = taskId;
	}

	public String getTaskDescription() {
		return TaskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		TaskDescription = taskDescription;
	}

	public TaskStatus getTaskStatus() {
		return TaskStatus;
	}

	public void setTaskStatus(TaskStatus status) {
	    this.TaskStatus = status;
	}

	public String getTaskAssignedTo() {
		return TaskAssignedTo;
	}

	public void setTaskAssignedTo(String taskAssignedTo) {
		TaskAssignedTo = taskAssignedTo;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public LocalDateTime getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDateTime deadline) {
		this.deadline = deadline;
	}

}
