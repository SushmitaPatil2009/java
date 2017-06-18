package com.sm.services.school.response;

import com.sm.models.CommonResponseModel;

public class SignUpResponseWrapper extends CommonResponseModel {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
