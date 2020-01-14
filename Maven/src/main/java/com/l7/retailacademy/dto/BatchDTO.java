package com.l7.retailacademy.dto;

public class BatchDTO {

	private int batchId;
	
	private String batchName;
	
	private String startDate;
	
	private String endDate;
	
	private String batchDescription;
	
	
	public BatchDTO() {

	}
	

	public BatchDTO(int batchId, String batchName, String startDate, String endDate, String batchDescription) {
		super();
		this.batchId = batchId;
		this.batchName = batchName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.batchDescription = batchDescription;
	}

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
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

	public String getBatchDescription() {
		return batchDescription;
	}

	public void setBatchDescription(String batchDescription) {
		this.batchDescription = batchDescription;
	}

	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchName=" + batchName + ", startDate=" + startDate + ", endDate="
				+ endDate + ", batchDescription=" + batchDescription + "]";
	}
	
	
	
}
