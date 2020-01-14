package com.l7.retailacademy.dto;

import com.l7.retailacademy.dto.AssessmentDTO;
import com.l7.retailacademy.dto.TechnologyDTO;
import com.l7.retailacademy.dto.TrainingGroupDTO;

public class TrainingGroupTechnologyDTO {

	private int groupTechId;
	
	private TechnologyDTO technology;
	
	private TrainingGroupDTO trainingGroup;
	
	private AssessmentDTO assessment;
	
	private float assessment_minmarks;
	
	private float assessment_maxmarks;

	public TrainingGroupTechnologyDTO( ) {
		
	}


	public AssessmentDTO getAssessment() {
		return assessment;
	}

	public void setAssessment(AssessmentDTO assessment) {
		this.assessment = assessment;
	}



	public float getAssessment_minmarks() {
		return assessment_minmarks;
	}



	public void setAssessment_minmarks(float assessment_minmarks) {
		this.assessment_minmarks = assessment_minmarks;
	}



	public float getAssessment_maxmarks() {
		return assessment_maxmarks;
	}



	public void setAssessment_maxmarks(float assessment_maxmarks) {
		this.assessment_maxmarks = assessment_maxmarks;
	}



	public TrainingGroupTechnologyDTO(int groupTechId, TechnologyDTO technology, TrainingGroupDTO trainingGroup,
			AssessmentDTO assessment, float assessment_minmarks, float assessment_maxmarks) {
		super();
		this.groupTechId = groupTechId;
		this.technology = technology;
		this.trainingGroup = trainingGroup;
		this.assessment = assessment;
		this.assessment_minmarks = assessment_minmarks;
		this.assessment_maxmarks = assessment_maxmarks;
	}



	public int getGroupTechId() {
		return groupTechId;
	}

	public void setGroupTechId(int groupTechId) {
		this.groupTechId = groupTechId;
	}

	public TechnologyDTO getTechnology() {
		return technology;
	}

	public void setTechnology(TechnologyDTO technology) {
		this.technology = technology;
	}

	public TrainingGroupDTO getTrainingGroup() {
		return trainingGroup;
	}

	public void setTrainingGroup(TrainingGroupDTO trainingGroup) {
		this.trainingGroup = trainingGroup;
	}

	@Override
	public String toString() {
		return "TrainingGroupTechnology [groupTechId=" + groupTechId + ", technology=" + technology + ", trainingGroup="
				+ trainingGroup + ", assessment=" + assessment + ", assessment_minmarks=" + assessment_minmarks
				+ ", assessment_maxmarks=" + assessment_maxmarks + "]";
	}
	
	
}
