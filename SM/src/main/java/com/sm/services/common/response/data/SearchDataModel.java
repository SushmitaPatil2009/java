package com.sm.services.common.response.data;

public class SearchDataModel {

	private String staffId;
	private String staffName;

	public SearchDataModel(String staffId, String staffName) {
		this.staffId = staffId;
		this.staffName = staffName;
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

}
