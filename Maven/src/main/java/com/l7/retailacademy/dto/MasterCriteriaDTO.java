package com.l7.retailacademy.dto;

public class MasterCriteriaDTO {

	private String criteriaName;
	private float maxScore;
	private float minScore;
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCriteriaName() {
		return criteriaName;
	}

	public void setCriteriaName(String criteriaName) {
		this.criteriaName = criteriaName;
	}

	public float getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(float maxScore) {
		this.maxScore = maxScore;
	}

	public float getMinScore() {
		return minScore;
	}

	public void setMinScore(float minScore) {
		this.minScore = minScore;
	}

	@Override
	public String toString() {
		return "MasterCriteria [criteriaName=" + criteriaName + ", maxScore=" + maxScore + ", minScore=" + minScore
				+ ", count=" + count + "]";
	}

	
}
