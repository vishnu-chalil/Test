package com.l7.retailacademy.dto;

import com.l7.retailacademy.dto.UserDTO;

public class AssessmentCandidateDTO {



	private UserDTO user;
	private float obtainedMarks;
	private String status;
	private float percentageMarks;
	private float assessmentMinMarks;
	private float assessmentMaxMarks;
	private String assessmentName;
	private String technology;
	private String trainingGroup;

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public float getObtainedMarks() {
		return obtainedMarks;
	}

	public void setObtainedMarks(float obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getPercentageMarks() {
		return percentageMarks;
	}

	public void setPercentageMarks(float percentageMarks) {
		this.percentageMarks = percentageMarks;
	}

	public float getAssessment_minmarks() {
		return assessmentMinMarks;
	}

	public void setAssessment_minmarks(float assessment_minmarks) {
		this.assessmentMinMarks = assessment_minmarks;
	}

	public float getAssessment_maxmarks() {
		return assessmentMaxMarks;
	}

	public void setAssessment_maxmarks(float assessment_maxmarks) {
		this.assessmentMaxMarks = assessment_maxmarks;
	}

	public String getAssessmentName() {
		return assessmentName;
	}

	public void setAssessmentName(String assessmentName) {
		this.assessmentName = assessmentName;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getTrainingGroup() {
		return trainingGroup;
	}

	public void setTrainingGroup(String trainingGroup) {
		this.trainingGroup = trainingGroup;
	}
	@Override
	public String toString() {
		return "AssessmentCandidate [user=" + user + ", obtainedMarks=" + obtainedMarks + ", status=" + status
				+ ", percentageMarks=" + percentageMarks + ", assessment_minmarks=" + assessmentMinMarks
				+ ", assessment_maxmarks=" + assessmentMaxMarks + ", assessmentName=" + assessmentName
				+ ", technology=" + technology + ", trainingGroup=" + trainingGroup + "]";
	}
	
}
