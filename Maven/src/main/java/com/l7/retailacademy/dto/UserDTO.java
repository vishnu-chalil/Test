package com.l7.retailacademy.dto;

public class UserDTO {

	private int userId;

	private String employeeId;

	private String userName;

	private String password;

	private String creationDate;

	private boolean activeStatus;

	public UserDTO() {

	}

	public UserDTO(int userId, String employeeId, String userName, String password, String creationDate,
			boolean activeStatus) {
		super();
		this.userId = userId;
		this.employeeId = employeeId;
		this.userName = userName;
		this.password = password;
		this.creationDate = creationDate;
		this.activeStatus = activeStatus;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public boolean isActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	@Override
	public String toString() {
		return "[userId=" + userId + ", employeeId=" + employeeId + ", userName=" + userName + ", password="
				+ password + ", creationDate=" + creationDate + ", activeStatus=" + activeStatus + "]";
	}
	
	

}
