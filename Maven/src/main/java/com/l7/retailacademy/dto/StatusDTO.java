package com.l7.retailacademy.dto;

public class StatusDTO {

	private int statusId;
	
	private String statusName;
	
	private int statusType;

	private boolean activeStatus;
	
	
	
	public StatusDTO() {

	}

	
	public StatusDTO(int statusId, String statusName, int statusType, boolean activeStatus) {
		super();
		this.statusId = statusId;
		this.statusName = statusName;
		this.statusType = statusType;
		this.activeStatus = activeStatus;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public int getStatusType() {
		return statusType;
	}

	public void setStatusType(int statusType) {
		this.statusType = statusType;
	}

	public boolean isActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}


	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", statusName=" + statusName + ", statusType=" + statusType
				+ ", activeStatus=" + activeStatus + "]";
	}

}
