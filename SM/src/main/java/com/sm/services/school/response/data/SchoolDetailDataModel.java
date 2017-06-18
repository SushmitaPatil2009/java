package com.sm.services.school.response.data;

public class SchoolDetailDataModel {

	private String schoolName;
	private String schoolCode;
	private String addressLine1;
	private String addressLine2;
	private String town;
	private String taluk;
	private String district;
	private String state;
	private String pinCode;
	private String schoolType;

	
	public SchoolDetailDataModel(String schoolName, String schoolCode, String addressLine1, String addressLine2,
			String town, String taluk, String district, String state, String pinCode, String schoolType) {
		this.schoolName = schoolName;
		this.schoolCode = schoolCode;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.town = town;
		this.taluk = taluk;
		this.district = district;
		this.state = state;
		this.pinCode = pinCode;
		this.schoolType = schoolType;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getTaluk() {
		return taluk;
	}

	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}
}
