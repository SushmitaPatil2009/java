package com.sm.services.common;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import com.sm.constants.AppConstants;
import com.sm.constants.DBConstants;
import com.sm.db.DBManager;
import com.sm.models.CommonResponseModel;
import com.sm.services.common.response.SearchResponseWrapper;
import com.sm.services.common.response.data.SearchDataModel;

public class GenericUtils {

	private EntityManager mEntityManager;

	public CommonResponseModel searchUser(String searchTerm) {

		SearchResponseWrapper responseWrapper = null;
		mEntityManager = DBManager.getDBManager();
		try {

			StoredProcedureQuery query = mEntityManager
					.createStoredProcedureQuery(DBConstants.StoredProcedure.SEARCH_SP);
			query.registerStoredProcedureParameter(DBConstants.Attributes.SEARCH_TERMS, String.class, ParameterMode.IN);
			query.setParameter(DBConstants.Attributes.SEARCH_TERMS, searchTerm);
			List<SearchDataModel> dataModel = query.getResultList();
			DBManager.saveAndClosDB(mEntityManager);
			responseWrapper = new SearchResponseWrapper();
			responseWrapper.setMessage(AppConstants.Message.USER_LIST);
			responseWrapper.setUserList(dataModel);
			System.out.println("responseWrapper  " + responseWrapper.getMessage());
			return responseWrapper;
		} catch (Exception e) {
			e.printStackTrace();
			if (mEntityManager != null)
				DBManager.rollBackAndClosDB(mEntityManager);
			throw e;

		}
	}

}
