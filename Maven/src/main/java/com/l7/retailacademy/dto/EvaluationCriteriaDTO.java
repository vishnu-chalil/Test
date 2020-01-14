package com.l7.retailacademy.dto;

import com.l7.retailacademy.dto.TrainingGroupTechnologyDTO;

public class EvaluationCriteriaDTO {
	
	private int criteriaId;
	
	private String criteriaName;
	
	private int criteriaMinMarks;
	
	private int criteriaMaxMarks;
	
	private int count;
	
	private TrainingGroupTechnologyDTO grpTechnologyId;
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	public EvaluationCriteriaDTO() {
		
	}
	
	

	@Override
	public String toString() {
		return "EvaluationCriteria [criteriaId=" + criteriaId + ", criteriaName=" + criteriaName + ", criteriaMinMarks="
				+ criteriaMinMarks + ", criteriaMaxMarks=" + criteriaMaxMarks + ", count=" + count
				+ ", grpTechnologyId=" + grpTechnologyId + "]";
	}

	public EvaluationCriteriaDTO(int criteriaId, String criteriaName, int criteriaMinMarks, int criteriaMaxMarks,
			TrainingGroupTechnologyDTO grpTechnologyId) {
		super();
		this.criteriaId = criteriaId;
		this.criteriaName = criteriaName;
		this.criteriaMinMarks = criteriaMinMarks;
		this.criteriaMaxMarks = criteriaMaxMarks;
		this.grpTechnologyId = grpTechnologyId;
	}



	public int getCriteriaId() {
		return criteriaId;
	}

	public TrainingGroupTechnologyDTO getGrpTechnologyId() {
		return grpTechnologyId;
	}

	public void setGrpTechnologyId(TrainingGroupTechnologyDTO grpTechnologyId) {
		this.grpTechnologyId = grpTechnologyId;
	}

	public void setCriteriaId(int criteriaId) {
		this.criteriaId = criteriaId;
	}

	public String getCriteriaName() {
		return criteriaName;
	}

	public void setCriteriaName(String criteriaName) {
		this.criteriaName = criteriaName;
	}

	public int getCriteriaMinMarks() {
		return criteriaMinMarks;
	}

	public void setCriteriaMinMarks(int criteriaMinMarks) {
		this.criteriaMinMarks = criteriaMinMarks;
	}

	public int getCriteriaMaxMarks() {
		return criteriaMaxMarks;
	}

	public void setCriteriaMaxMarks(int criteriaMaxMarks) {
		this.criteriaMaxMarks = criteriaMaxMarks;
	}

	

}
