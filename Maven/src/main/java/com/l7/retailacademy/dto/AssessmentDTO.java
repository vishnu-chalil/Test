package com.l7.retailacademy.dto;

import com.l7.retailacademy.dto.AssessmentTypeDTO;
import com.l7.retailacademy.dto.UserDTO;

public class AssessmentDTO {

	
	private int assessmentId;
	
	private String assessmentName;
		
	private String creationDate;
	
	private UserDTO createdby;
		
	private AssessmentTypeDTO assessmentType;
	
	private boolean activeStatus;
	
	
	
	public AssessmentDTO() {
	
	}
	
	
	public AssessmentDTO(int assessmentId, String assessmentName, String creationDate, 
			UserDTO createdby,  AssessmentTypeDTO assessmentType,boolean activeStatus) {

		this.assessmentId = assessmentId;
		this.assessmentName = assessmentName;
		this.creationDate = creationDate;
		this.createdby = createdby;
		this.assessmentType = assessmentType;
		this.activeStatus = activeStatus;
	}

	public int getAssessmentId() {
		return assessmentId;
	}

	public void setAssessmentId(int assessmentId) {
		this.assessmentId = assessmentId;
	}

	public String getAssessmentName() {
		return assessmentName;
	}

	public void setAssessmentName(String assessmentName) {
		this.assessmentName = assessmentName;
	}


	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public UserDTO getCreatedby() {
		return createdby;
	}

	public void setCreatedby(UserDTO createdby) {
		this.createdby = createdby;
	}



	public AssessmentTypeDTO getAssessmentType() {
		return assessmentType;
	}

	public void setAssessmentType(AssessmentTypeDTO assessmentType) {
		this.assessmentType = assessmentType;
	}

	public boolean isActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}


	@Override
	public String toString() {
		return "Assessment [assessmentId=" + assessmentId + ", assessmentName=" + assessmentName
				+ ", creationDate=" + creationDate + ", createdby=" + createdby + ", assessmentType=" +
				assessmentType + ", activeStatus=" + activeStatus + "]";
	}
	
	
	
	
}
