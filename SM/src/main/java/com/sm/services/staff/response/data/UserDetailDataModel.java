package com.sm.services.staff.response.data;

public class UserDetailDataModel {

	private String staffId;
	private String staffName;
	private String designation;
	private String specilization;
	
	public UserDetailDataModel(String staffId, String staffName, String designation, String specilization) {
		this.staffId = staffId;
		this.staffName = staffName;
		this.designation = designation;
		this.specilization = specilization;
	}

	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSpecilization() {
		return specilization;
	}
	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	
	}
