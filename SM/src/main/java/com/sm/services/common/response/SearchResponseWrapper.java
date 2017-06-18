package com.sm.services.common.response;

import java.util.ArrayList;
import java.util.List;

import com.sm.models.CommonResponseModel;
import com.sm.services.common.response.data.SearchDataModel;

public class SearchResponseWrapper extends CommonResponseModel {

	List<SearchDataModel> userList = new ArrayList<>();

	public List<SearchDataModel> getUserList() {
		return userList;
	}

	public void setUserList(List<SearchDataModel> userList) {
		this.userList = userList;
	}
}
