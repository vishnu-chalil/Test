package com.l7.retailacademy.dto;

public class AssessmentTypeDTO {
	
	private int assessmentTypeId;
	
	private String assessmentTypeName;
	

	public AssessmentTypeDTO() {
		
	}

	public AssessmentTypeDTO(int assessmentTypeId, String assessmentTypeName) {
		super();
		this.assessmentTypeId = assessmentTypeId;
		this.assessmentTypeName = assessmentTypeName;
	}

	public int getAssessmentTypeId() {
		return assessmentTypeId;
	}

	public void setAssessmentTypeId(int assessmentTypeId) {
		this.assessmentTypeId = assessmentTypeId;
	}

	public String getAssessmentTypeName() {
		return assessmentTypeName;
	}

	public void setAssessmentTypeName(String assessmentTypeName) {
		this.assessmentTypeName = assessmentTypeName;
	}

	@Override
	public String toString() {
		return "AssessmentType [assessmentTypeId=" + assessmentTypeId + ", assessmentTypeName=" + assessmentTypeName
				+ "]";
	}
	
	
	

}
