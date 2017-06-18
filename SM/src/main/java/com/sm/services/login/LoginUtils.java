package com.sm.services.login;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;

import com.sm.constants.AppConstants;
import com.sm.constants.DBConstants;
import com.sm.db.DBManager;
import com.sm.models.CommonResponseModel;
import com.sm.services.login.models.LoginModel;
import com.sm.services.login.response.LoginResponseWrapper;
import com.sm.utils.CommonUtils;

public class LoginUtils {

	private EntityManager mEntityManager;

	public CommonResponseModel validateUser(LoginModel loginModel, HttpServletRequest request) {

		LoginResponseWrapper responseWrapper = null;
		mEntityManager = DBManager.getDBManager();
		System.out.println(mEntityManager);
		String userId = loginModel.getUserId();
		String passWord = loginModel.getPassWord();
		int roleId = loginModel.getRoleId();

		if (!CommonUtils.isValidString(userId) || !CommonUtils.isValidString(passWord) || roleId < 1) {
			System.out.println(AppConstants.Message.INVALID_INPUT);
			return CommonUtils.throwError(Response.Status.NOT_ACCEPTABLE.getStatusCode(),
					AppConstants.Message.INVALID_INPUT);
		}

		try {

			StoredProcedureQuery query = mEntityManager
					.createStoredProcedureQuery(DBConstants.StoredProcedure.LOGIN_SP);
			query.registerStoredProcedureParameter(DBConstants.Attributes.USER_NAME, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.PASSWORD, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.ROLE_ID, Integer.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.IP_ADDRESS, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(DBConstants.Attributes.COUNT, Integer.class, ParameterMode.OUT);

			query.setParameter(DBConstants.Attributes.USER_NAME, userId);
			query.setParameter(DBConstants.Attributes.PASSWORD, passWord);
			query.setParameter(DBConstants.Attributes.ROLE_ID, roleId);
			query.setParameter(DBConstants.Attributes.IP_ADDRESS, getIpAddress(request));

			int count = query.executeUpdate();
			
			// int count = (int)
			// query.getOutputParameterValue(DBConstants.Attributes.COUNT);
			DBManager.saveAndClosDB(mEntityManager);
			responseWrapper = new LoginResponseWrapper();
			System.out.println("Count " +count);
			if (count == 0) {
				return new CommonResponseModel(AppConstants.Status.UNAUTHORIZED, AppConstants.Message.UNAUTORISED_USER);
			} 
			responseWrapper.setMessage(AppConstants.Message.LOGIN_SUCCESS);
				 
			
			System.out.println("responseWrapper  " + responseWrapper.getMessage());
            return responseWrapper;
		} catch (Exception e) {
			e.printStackTrace();
			if (mEntityManager != null)
				DBManager.rollBackAndClosDB(mEntityManager);
			throw e;

		}
	}

	private String getIpAddress(HttpServletRequest request) {
		String ipAddress = request.getHeader("X-FORWARDED-FOR");
		if (ipAddress == null) {
			ipAddress = request.getRemoteAddr();
		}
		return ipAddress;
	}
}
