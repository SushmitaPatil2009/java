package com.sm.services.staff.response;

import java.util.List;

import com.sm.models.CommonResponseModel;
import com.sm.services.staff.response.data.UserDetailDataModel;

public class UserDetailsResponseWrapper extends CommonResponseModel {

	List<UserDetailDataModel> model;

	public List<UserDetailDataModel> getModel() {
		return model;
	}

	public void setModel(List<UserDetailDataModel> model) {
		this.model = model;
	}

}
