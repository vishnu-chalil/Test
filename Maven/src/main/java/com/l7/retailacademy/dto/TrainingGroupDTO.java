package com.l7.retailacademy.dto;

import com.l7.retailacademy.dto.TrainingGroupTypeDTO;

public class TrainingGroupDTO {
	
	private int trainingGroupId;
	
	private String trainingGroupName;
	
	private String startDate;
	
	private String endDate;
	
	private String courseplanPath;

	private TrainingGroupTypeDTO groupType;
	
	private boolean activeStatus;
	
	public TrainingGroupDTO() {
		
	}


	public TrainingGroupDTO(int trainingGroupId, String trainingGroupName, String startDate, String endDate,
			String courseplanPath, TrainingGroupTypeDTO groupType, boolean activeStatus) {
		super();
		this.trainingGroupId = trainingGroupId;
		this.trainingGroupName = trainingGroupName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.courseplanPath = courseplanPath;
		this.groupType = groupType;
		this.activeStatus = activeStatus;
	}

	public int getTrainingGroupId() {
		return trainingGroupId;
	}

	public void setTrainingGroupId(int trainingGroupId) {
		this.trainingGroupId = trainingGroupId;
	}

	public String getTrainingGroupName() {
		return trainingGroupName;
	}

	public void setTrainingGroupName(String trainingGroupName) {
		this.trainingGroupName = trainingGroupName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getCourseplanPath() {
		return courseplanPath;
	}

	public void setCourseplanPath(String courseplanPath) {
		this.courseplanPath = courseplanPath;
	}

	public TrainingGroupTypeDTO getGroupType() {
		return groupType;
	}

	public void setGroupType(TrainingGroupTypeDTO groupType) {
		this.groupType = groupType;
	}

	public boolean isActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}


	@Override
	public String toString() {
		return "TrainingGroup [trainingGroupId=" + trainingGroupId + ", trainingGroupName=" + trainingGroupName
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", courseplanPath=" + courseplanPath
				+ ", groupType=" + groupType + ", activeStatus=" + activeStatus + "]";
	}
	
	
}
