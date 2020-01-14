package com.l7.retailacademy.dto;

public class TechnologyDTO {
	
	private int technologyId;
	
	private String technologyName;
	
	

	public TechnologyDTO() {
		
	}

	
	public TechnologyDTO(int technologyId, String technologyName) {
		super();
		this.technologyId = technologyId;
		this.technologyName = technologyName;
	}

	public int getTechnologyId() {
		return technologyId;
	}

	public void setTechnologyId(int technologyId) {
		this.technologyId = technologyId;
	}

	public String getTechnologyName() {
		return technologyName;
	}

	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}


	@Override
	public String toString() {
		return "Technology [technologyId=" + technologyId + ", technologyName=" + technologyName + "]";
	}
	
	

}
