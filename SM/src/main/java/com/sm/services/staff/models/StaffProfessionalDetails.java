package com.sm.services.staff.models;

import java.sql.Date;

public class StaffProfessionalDetails {

	private Integer staffId;
	private String designation;
	private Date dateOfJoining;
	private Date dateOfRetirement;
	private String subjectName;
	private Integer employeementGroupId;
	private String gradePay;
	private String payScale;
	private Date dateOfNextIncrement;
	private String amtOfIncrement;
	private Integer serviceTypeId;
	private Integer employeementTypeId;
	private Date appointmentDate;
	public Integer getStaffId() {
		return staffId;
	}
	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public Date getDateOfRetirement() {
		return dateOfRetirement;
	}
	public void setDateOfRetirement(Date dateOfRetirement) {
		this.dateOfRetirement = dateOfRetirement;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Integer getEmployeementGroupId() {
		return employeementGroupId;
	}
	public void setEmployeementGroupId(Integer employeementGroupId) {
		this.employeementGroupId = employeementGroupId;
	}
	public String getGradePay() {
		return gradePay;
	}
	public void setGradePay(String gradePay) {
		this.gradePay = gradePay;
	}
	public String getPayScale() {
		return payScale;
	}
	public void setPayScale(String payScale) {
		this.payScale = payScale;
	}
	public Date getDateOfNextIncrement() {
		return dateOfNextIncrement;
	}
	public void setDateOfNextIncrement(Date dateOfNextIncrement) {
		this.dateOfNextIncrement = dateOfNextIncrement;
	}
	public String getAmtOfIncrement() {
		return amtOfIncrement;
	}
	public void setAmtOfIncrement(String amtOfIncrement) {
		this.amtOfIncrement = amtOfIncrement;
	}
	public Integer getServiceTypeId() {
		return serviceTypeId;
	}
	public void setServiceTypeId(Integer serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}
	public Integer getEmployeementTypeId() {
		return employeementTypeId;
	}
	public void setEmployeementTypeId(Integer employeementTypeId) {
		this.employeementTypeId = employeementTypeId;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	
}
