package com.l7.retailacademy.dto;

/**
 * @author Vishnu.chalil
 *This dto is used to transfer the data of master_data excel sheet.
 */
public class MasterAssessmentDTO {

	private String empId;
	private String userName;
	private String batch;
	private String startDate;
	private String endDate;
	private String trainingGroup;
	private String assessmentName;
	private String assessmentType;
	private String assessmentTechnology;
	private float assessmentMaxMarks;
	private float assessmentMinMarks;
	private float assessmentScore;
	private String assessmentStatus;
	private int rowNumber;
	
	
	public int getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
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

	public String getEmpId() {

		return empId;
	}

	public void setEmpId(String empId) {

		this.empId = empId;
	}

	public String getUserName() {

		return userName;
	}

	public void setUserName(String userName) {

		this.userName = userName;
	}

	public String getBatch() {

		return batch;
	}

	public void setBatch(String batch) {

		this.batch = batch;
	}


	public String getTrainingGroup() {
		return trainingGroup;
	}

	public void setTrainingGroup(String trainingGroup) {
		this.trainingGroup = trainingGroup;
	}

	public String getAssessmentName() {
		return assessmentName;
	}

	public void setAssessmentName(String assessmentName) {
		this.assessmentName = assessmentName;
	}

	public String getAssessmentType() {
		return assessmentType;
	}

	public void setAssessmentType(String assessmentType) {
		this.assessmentType = assessmentType;
	}

	public String getAssessmentTechnology() {
		return assessmentTechnology;
	}

	public void setAssessmentTechnology(String assessmentTechnology) {
		this.assessmentTechnology = assessmentTechnology;
	}

	public float getAssessmentMaxMarks() {
		return assessmentMaxMarks;
	}

	public void setAssessmentMaxMarks(float assessmentMaxMarks) {
		this.assessmentMaxMarks = assessmentMaxMarks;
	}

	public float getAssessmentMinMarks() {
		return assessmentMinMarks;
	}

	public void setAssessmentMinMarks(float assessmentMinMarks) {
		this.assessmentMinMarks = assessmentMinMarks;
	}

	public float getAssessmentScore() {
		return assessmentScore;
	}

	public void setAssessmentScore(float assessmentScore) {
		this.assessmentScore = assessmentScore;
	}


	public String getAssessmentStatus() {
		return assessmentStatus;
	}

	public void setAssessmentStatus(String assessmentStatus) {
		this.assessmentStatus = assessmentStatus;
	}

	@Override
	public String toString() {
		return "MasterAssessment [empId=" + empId + ", userName=" + userName + ", batch=" + batch + ", startDate="
				+ startDate + ", endDate=" + endDate + ", trainingGroup=" + trainingGroup + ", assessmentName="
				+ assessmentName + ", assessmentType=" + assessmentType + ", assessmentTechnology="
				+ assessmentTechnology + ", assessmentMaxMarks=" + assessmentMaxMarks + ", assessmentMinMarks="
				+ assessmentMinMarks + ", assessmentScore=" + assessmentScore + ", assessmentStatus=" + assessmentStatus
				+ ", rowNumber=" + rowNumber + "]";
	}

	
}
