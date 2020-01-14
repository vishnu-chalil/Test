package com.l7.retailacademy.dto;

import com.l7.retailacademy.dto.ModuleDTO;

public class FeatureDTO {
	
	private int featureId;
	
	private String featureName;
	
	private ModuleDTO module;
	
	public FeatureDTO() {
		
		
	}
	
	public FeatureDTO(int featureId, String featureName, ModuleDTO module, String creationDate, boolean activeStatus) {
		super();
		this.featureId = featureId;
		this.featureName = featureName;
		this.creationDate = creationDate;
		this.activeStatus = activeStatus;
	    this.module = module;
	}

	@Override
	public String toString() {
		return "FeatureDTO [featureId=" + featureId + ", featureName=" + featureName + ", module" + module
				+ ", creationDate=" + creationDate + ", activeStatus=" + activeStatus + "]";
	}

	private String creationDate;
	
	private boolean activeStatus;
	
	
	public int getFeatureId() {
		return featureId;
	}
	
	public void setFeatureId(int featureId) {
		this.featureId = featureId;
	}
	
	public String getFeatureName() {
		return featureName;
	}
	
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	
	public ModuleDTO getModule() {
		return module;
	}

	public void setModule(ModuleDTO module) {
		this.module = module;
	}

	public String getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	
	public boolean isActiveStatus() {
		return activeStatus;
	}
	
	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
	
	
}
