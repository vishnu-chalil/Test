package com.l7.retailacademy.dto;

public class BatchReportDTO {

	private String name;
	private String empId;
	private String traingGroup;
	private float marks;
	private float minMarks;

	private int count;

	
	public float getMinMarks() {
		return minMarks;
	}

	public void setMinMarks(float minMarks) {
		this.minMarks = minMarks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getTraingGroup() {
		return traingGroup;
	}

	public void setTraingGroup(String traingGroup) {
		this.traingGroup = traingGroup;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "BatchReport [name=" + name + ", empId=" + empId + ", traingGroup=" + traingGroup + ", marks=" + marks
				+ ", count=" + count + "]";
	}

	

}
