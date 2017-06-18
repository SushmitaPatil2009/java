package com.sm.services.staff;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import javax.servlet.http.HttpServletRequest;

import com.sm.constants.AppConstants;
import com.sm.constants.DBConstants;
import com.sm.db.DBManager;
import com.sm.models.CommonResponseModel;
import com.sm.services.staff.models.StaffAddressDetails;
import com.sm.services.staff.models.StaffBankDetails;
import com.sm.services.staff.models.StaffBasicDetails;
import com.sm.services.staff.models.StaffProfessionalDetails;
import com.sm.services.staff.response.StaffBasicDetailsResponseWrapper;
import com.sm.services.staff.response.UserDetailsResponseWrapper;
import com.sm.services.staff.response.data.UserDetailDataModel;

public class StaffUtils {

	private EntityManager mEntityManager;

	public CommonResponseModel saveBasicInfoOfStaff(StaffBasicDetails staffDetails, HttpServletRequest request) {
		StaffBasicDetailsResponseWrapper responseWrapper = null;
		mEntityManager = DBManager.getDBManager();
		try {

			StoredProcedureQuery query = mEntityManager
					.createStoredProcedureQuery(DBConstants.StoredProcedure.SF_BASIC_DATA_SP);
			query.registerStoredProcedureParameter(DBConstants.Attributes.EMPLOYEE_NAME, String.class,
					ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.LAST_NAME, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.MIDDLE_NAME, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.MOTHER_NAME, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.FATHER_NAME, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.MOTHER_TONGUE, String.class,
					ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.DOB, Date.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.GENDER, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.PAN_NUMBER, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.ADHAR_ID, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.VOTER_ID, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.BLOOD_GROUP, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.HEIGHT, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.CASTE, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.SUB_CASTE, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.IDENTIFICATION_MARK, String.class,
					ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.IS_PHYSICALLY_DIASBLED, Boolean.class,
					ParameterMode.IN);

			query.setParameter(DBConstants.Attributes.EMPLOYEE_NAME, staffDetails.getEmployeeName());
			query.setParameter(DBConstants.Attributes.MIDDLE_NAME, staffDetails.getMiddleName());
			query.setParameter(DBConstants.Attributes.LAST_NAME, staffDetails.getLastName());
			query.setParameter(DBConstants.Attributes.MOTHER_NAME, staffDetails.getMotherName());
			query.setParameter(DBConstants.Attributes.FATHER_NAME, staffDetails.getFatherName());
			query.setParameter(DBConstants.Attributes.MOTHER_TONGUE, staffDetails.getMotherTongue());
			query.setParameter(DBConstants.Attributes.DOB, staffDetails.getDob());
			query.setParameter(DBConstants.Attributes.GENDER, staffDetails.getGender());
			query.setParameter(DBConstants.Attributes.PAN_NUMBER, staffDetails.getPanNumber());
			query.setParameter(DBConstants.Attributes.ADHAR_ID, staffDetails.getAdharId());
			query.setParameter(DBConstants.Attributes.VOTER_ID, staffDetails.getVoterId());
			query.setParameter(DBConstants.Attributes.BLOOD_GROUP, staffDetails.getBloodGroup());
			query.setParameter(DBConstants.Attributes.HEIGHT, staffDetails.getHeight());
			query.setParameter(DBConstants.Attributes.CASTE, staffDetails.getCaste());
			query.setParameter(DBConstants.Attributes.SUB_CASTE, staffDetails.getSubCaste());
			query.setParameter(DBConstants.Attributes.IDENTIFICATION_MARK, staffDetails.getIdentificationMark());
			query.setParameter(DBConstants.Attributes.IS_PHYSICALLY_DIASBLED, staffDetails.getIsPhysicallyDiasbled());

			query.execute();
			DBManager.saveAndClosDB(mEntityManager);
			responseWrapper = new StaffBasicDetailsResponseWrapper();
			responseWrapper.setMessage(AppConstants.Message.SF_BASIC_DETAILS_SUCCESS);
			return responseWrapper;
		} catch (Exception e) {
			e.printStackTrace();
			if (mEntityManager != null)
				DBManager.rollBackAndClosDB(mEntityManager);
			throw e;

		}
	}

	public CommonResponseModel saveProfessionalDetailsOfStaff(StaffProfessionalDetails professionalDetails,
			HttpServletRequest request) {
		StaffBasicDetailsResponseWrapper responseWrapper = null;
		mEntityManager = DBManager.getDBManager();
		try {

			StoredProcedureQuery query = mEntityManager
					.createStoredProcedureQuery(DBConstants.StoredProcedure.SF_PROFESSIONAL_DATA_SP);
			query.registerStoredProcedureParameter(DBConstants.Attributes.STAFF_ID, Integer.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.DESIGNATION, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.DATE_OF_JOINING, Date.class,
					ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.DATE_OF_RETIREMENT, Date.class,
					ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.SUBJECT_NAME, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.EMPLOYEEMENT_GROUP_ID, Integer.class,
					ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.GRADE_PAY, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.PAY_SCALE, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.DATE_OF_NEXT_INCREMENT, Date.class,
					ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.AMT_OF_INCREMENT, String.class,
					ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.SERVICE_TYPE_ID, Integer.class,
					ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.EMPLOYEEMENT_TYPE_ID, Integer.class,
					ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.APPOINTMENT_DATE, Date.class,
					ParameterMode.IN);
			query.setParameter(DBConstants.Attributes.STAFF_ID, professionalDetails.getStaffId());
			query.setParameter(DBConstants.Attributes.DESIGNATION, professionalDetails.getDesignation());
			query.setParameter(DBConstants.Attributes.DATE_OF_JOINING, professionalDetails.getDateOfJoining());
			query.setParameter(DBConstants.Attributes.DATE_OF_RETIREMENT, professionalDetails.getDateOfRetirement());
			query.setParameter(DBConstants.Attributes.SUBJECT_NAME, professionalDetails.getSubjectName());
			query.setParameter(DBConstants.Attributes.EMPLOYEEMENT_GROUP_ID,
					professionalDetails.getEmployeementGroupId());
			query.setParameter(DBConstants.Attributes.GRADE_PAY, professionalDetails.getGradePay());
			query.setParameter(DBConstants.Attributes.PAY_SCALE, professionalDetails.getPayScale());
			query.setParameter(DBConstants.Attributes.DATE_OF_NEXT_INCREMENT,
					professionalDetails.getDateOfNextIncrement());
			query.setParameter(DBConstants.Attributes.AMT_OF_INCREMENT, professionalDetails.getAmtOfIncrement());
			query.setParameter(DBConstants.Attributes.SERVICE_TYPE_ID, professionalDetails.getServiceTypeId());
			query.setParameter(DBConstants.Attributes.EMPLOYEEMENT_TYPE_ID,
					professionalDetails.getEmployeementTypeId());
			query.setParameter(DBConstants.Attributes.APPOINTMENT_DATE, professionalDetails.getAppointmentDate());

			query.execute();
			DBManager.saveAndClosDB(mEntityManager);
			responseWrapper = new StaffBasicDetailsResponseWrapper();
			responseWrapper.setMessage(AppConstants.Message.SF_PROFESSIONAL_DETAILS_SUCCESS);
			return responseWrapper;
		} catch (Exception e) {
			e.printStackTrace();
			if (mEntityManager != null)
				DBManager.rollBackAndClosDB(mEntityManager);
			throw e;

		}
	}

	public CommonResponseModel saveBankDetailsOfStaff(StaffBankDetails bankDetails, HttpServletRequest request) {
		StaffBasicDetailsResponseWrapper responseWrapper = null;
		mEntityManager = DBManager.getDBManager();
		try {

			StoredProcedureQuery query = mEntityManager
					.createStoredProcedureQuery(DBConstants.StoredProcedure.SF_BANK_DATA_SP);
			query.registerStoredProcedureParameter(DBConstants.Attributes.BANK_NAME, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.BRANCH_NAME, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.BRANCH_CODE, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.MICR_NUM, Integer.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.IFSF_CODE, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.ACCOUNT_NUMBER, String.class,
					ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.STAFF_ID, Integer.class, ParameterMode.IN);

			query.setParameter(DBConstants.Attributes.BANK_NAME, bankDetails.getBankName());
			query.setParameter(DBConstants.Attributes.BRANCH_NAME, bankDetails.getBranchName());
			query.setParameter(DBConstants.Attributes.BRANCH_CODE, bankDetails.getBranchCode());
			query.setParameter(DBConstants.Attributes.MICR_NUM, bankDetails.getMicrNum());
			query.setParameter(DBConstants.Attributes.IFSF_CODE, bankDetails.getIfsfCode());
			query.setParameter(DBConstants.Attributes.ACCOUNT_NUMBER, bankDetails.getAccountNumber());
			query.setParameter(DBConstants.Attributes.STAFF_ID, bankDetails.getStaffId());

			query.execute();
			DBManager.saveAndClosDB(mEntityManager);
			responseWrapper = new StaffBasicDetailsResponseWrapper();
			responseWrapper.setMessage(AppConstants.Message.SF_BANK_DETAILS_SUCCESS);
			return responseWrapper;
		} catch (Exception e) {
			e.printStackTrace();
			if (mEntityManager != null)
				DBManager.rollBackAndClosDB(mEntityManager);
			throw e;

		}
	}

	public CommonResponseModel saveAddressDetailsOfStaff(StaffAddressDetails addressDetails,
			HttpServletRequest request) {
		StaffBasicDetailsResponseWrapper responseWrapper = null;
		mEntityManager = DBManager.getDBManager();
		try {

			StoredProcedureQuery query = mEntityManager
					.createStoredProcedureQuery(DBConstants.StoredProcedure.SF_ADDRESS_DATA_SP);
			query.registerStoredProcedureParameter(DBConstants.Attributes.HOUSE_NUMBER, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.ADDRESS_LINE1, String.class,
					ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.TOWN, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.DISTRICT, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.STATE, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.POST_OFFICE, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.PIN_CODE, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.EMAIL_ID, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.ADDRESS_TYPE_ID, Integer.class,
					ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.STAFF_ID, Integer.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.HOUSING_SCHEME_NAME, String.class,
					ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.MOBILE_NUMBER, String.class,
					ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.LAND_LINE, String.class, ParameterMode.IN);

			query.setParameter(DBConstants.Attributes.HOUSE_NUMBER, addressDetails.getHouseNumber());
			query.setParameter(DBConstants.Attributes.ADDRESS_LINE1, addressDetails.getAddressLine1());
			query.setParameter(DBConstants.Attributes.TOWN, addressDetails.getTown());
			query.setParameter(DBConstants.Attributes.DISTRICT, addressDetails.getDistrict());
			query.setParameter(DBConstants.Attributes.STATE, addressDetails.getState());
			query.setParameter(DBConstants.Attributes.POST_OFFICE, addressDetails.getPostOffice());
			query.setParameter(DBConstants.Attributes.PIN_CODE, addressDetails.getPinCode());
			query.setParameter(DBConstants.Attributes.EMAIL_ID, addressDetails.getEmailId());
			query.setParameter(DBConstants.Attributes.ADDRESS_TYPE_ID, addressDetails.getAddressTypeId());
			query.setParameter(DBConstants.Attributes.STAFF_ID, addressDetails.getStaffId());
			query.setParameter(DBConstants.Attributes.HOUSING_SCHEME_NAME, addressDetails.getHousingSchemeName());
			query.setParameter(DBConstants.Attributes.MOBILE_NUMBER, addressDetails.getMobileNumber());
			query.setParameter(DBConstants.Attributes.LAND_LINE, addressDetails.getLandLine());

			query.execute();
			DBManager.saveAndClosDB(mEntityManager);
			responseWrapper = new StaffBasicDetailsResponseWrapper();
			responseWrapper.setMessage(AppConstants.Message.SF_ADDRESS_DETAILS_SUCCESS);
			return responseWrapper;
		} catch (Exception e) {
			e.printStackTrace();
			if (mEntityManager != null)
				DBManager.rollBackAndClosDB(mEntityManager);
			throw e;

		}
	}

	public CommonResponseModel getStaffDetails(String staffId) {
		UserDetailsResponseWrapper responseWrapper = null;
		mEntityManager = DBManager.getDBManager();
		try {

			StoredProcedureQuery query = mEntityManager
					.createStoredProcedureQuery(DBConstants.StoredProcedure.GET_STAFF_DATA_SP);
			query.registerStoredProcedureParameter(DBConstants.Attributes.STAFF_ID, String.class, ParameterMode.IN);
			query.setParameter(DBConstants.Attributes.STAFF_ID, staffId);

			List<UserDetailDataModel> model =  query.getResultList();
			DBManager.saveAndClosDB(mEntityManager);
			responseWrapper = new UserDetailsResponseWrapper();
			responseWrapper.setModel(model);
			responseWrapper.setMessage(AppConstants.Message.USER_DETAILS);
			return responseWrapper;
		} catch (Exception e) {
			e.printStackTrace();
			if (mEntityManager != null)
				DBManager.rollBackAndClosDB(mEntityManager);
			throw e;

		}
	}

}
