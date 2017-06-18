package com.sm.services.login.response;

import com.sm.models.CommonResponseModel;

public class LoginResponseWrapper extends CommonResponseModel {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
