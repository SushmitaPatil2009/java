package com.sm.services.school;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import javax.servlet.http.HttpServletRequest;

import com.sm.constants.AppConstants;
import com.sm.constants.DBConstants;
import com.sm.db.DBManager;
import com.sm.models.CommonResponseModel;
import com.sm.services.school.models.SchoolDetailModel;
import com.sm.services.school.response.SchoolDeatilResponseWrapper;
import com.sm.services.school.response.SignUpResponseWrapper;
import com.sm.services.school.response.data.SchoolDetailDataModel;

public class SchoolUtils {

	private EntityManager mEntityManager;

	public CommonResponseModel signUp(SchoolDetailModel schoolDetailModel, HttpServletRequest request) {

		SignUpResponseWrapper responseWrapper = null;
		mEntityManager = DBManager.getDBManager();

		try {

			StoredProcedureQuery query = mEntityManager
					.createStoredProcedureQuery(DBConstants.StoredProcedure.CREATE_SCHOOL_ACCOUNT_SP);
			query.registerStoredProcedureParameter(DBConstants.Attributes.SCHOOL_NAME, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.SCHOOL_CODE, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.ADDRESS_LINE1, String.class,
					ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.ADDRESS_LINE2, String.class,
					ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.TOWN, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.TALUK, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.DISTRICT, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.STATE, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.PIN_CODE, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.SCHOOL_TYPE, Integer.class, ParameterMode.IN);

			query.setParameter(DBConstants.Attributes.SCHOOL_NAME, schoolDetailModel.getSchoolName());
			query.setParameter(DBConstants.Attributes.SCHOOL_CODE, schoolDetailModel.getSchoolCode());
			query.setParameter(DBConstants.Attributes.ADDRESS_LINE1, schoolDetailModel.getAddressLine1());
			query.setParameter(DBConstants.Attributes.ADDRESS_LINE2, schoolDetailModel.getAddressLine2());
			query.setParameter(DBConstants.Attributes.TOWN, schoolDetailModel.getTown());
			query.setParameter(DBConstants.Attributes.TALUK, schoolDetailModel.getTaluk());
			query.setParameter(DBConstants.Attributes.DISTRICT, schoolDetailModel.getDistrict());
			query.setParameter(DBConstants.Attributes.STATE, schoolDetailModel.getState());
			query.setParameter(DBConstants.Attributes.PIN_CODE, schoolDetailModel.getPinCode());
			query.setParameter(DBConstants.Attributes.SCHOOL_TYPE, schoolDetailModel.getSchoolType());

			query.execute();
			DBManager.saveAndClosDB(mEntityManager);

			responseWrapper = new SignUpResponseWrapper();
			responseWrapper.setMessage(AppConstants.Message.SIGN_UP_SUCCESS);
			return responseWrapper;
		} catch (Exception e) {
			e.printStackTrace();
			if (mEntityManager != null)
				DBManager.rollBackAndClosDB(mEntityManager);
			throw e;

		}
	}

	@SuppressWarnings("unchecked")
	public CommonResponseModel getSchoolDetails(HttpServletRequest request) {

		SchoolDeatilResponseWrapper responseWrapper = null;
		mEntityManager = DBManager.getDBManager();
		try {

			StoredProcedureQuery query = mEntityManager.createStoredProcedureQuery(
					DBConstants.StoredProcedure.GET_SCHOOL_DETAIL_SP, DBConstants.Mapping.SCHOOL_DETAIL);
			List<SchoolDetailDataModel> schoolDetailModelsList = query.getResultList();
			DBManager.saveAndClosDB(mEntityManager);
			responseWrapper = new SchoolDeatilResponseWrapper();
			if (schoolDetailModelsList.size() > 0){
				responseWrapper.setMessage(AppConstants.Message.SCHOOL_DETAILS);
				responseWrapper.setDetailModel(schoolDetailModelsList.get(0));
			}
			else{
				return new CommonResponseModel(AppConstants.Status.SIGNUP, AppConstants.Message.SIGNUP_MSG);
			}
			return responseWrapper;
		} catch (Exception e) {
			e.printStackTrace();
			if (mEntityManager != null)
				DBManager.rollBackAndClosDB(mEntityManager);
			throw e;

		}
	}
}
