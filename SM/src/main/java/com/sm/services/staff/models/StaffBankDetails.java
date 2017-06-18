package com.sm.services.staff.models;

public class StaffBankDetails {

	private Integer staffId;
	private String bankName;
	private String branchName;
	private String branchCode;
	private Integer micrNum;
	private String ifsfCode;
	private String accountNumber;
	
	public Integer getStaffId() {
		return staffId;
	}
	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public Integer getMicrNum() {
		return micrNum;
	}
	public void setMicrNum(Integer micrNum) {
		this.micrNum = micrNum;
	}
	public String getIfsfCode() {
		return ifsfCode;
	}
	public void setIfsfCode(String ifsfCode) {
		this.ifsfCode = ifsfCode;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
}
