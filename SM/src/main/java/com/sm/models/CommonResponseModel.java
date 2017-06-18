package com.sm.models;

import com.sm.constants.AppConstants;

public class CommonResponseModel {
	private int code;
	private String message;

	public CommonResponseModel() {
		code = 200;
		message = AppConstants.Common.SUCCESS_MESSAGE;
	}

	public CommonResponseModel(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
