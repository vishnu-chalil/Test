package com.l7.retailacademy.dto;

public class ModuleDTO {
	
	private int moduleId;
	private String moduleName;
	
	
	public ModuleDTO() {
	
	}
	
	public ModuleDTO(int moduleId, String moduleName) {
		super();
		this.moduleId = moduleId;
		this.moduleName = moduleName;
	}
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	
	
	@Override
	public String toString() {
		return "ModuleDTO [moduleId=" + moduleId + ", moduleName=" + moduleName + "]";
	}

}
