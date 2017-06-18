package com.sm.utils;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sm.models.CommonResponseModel;

public class CommonUtils {

	public static String baseUri;

	public static boolean isValidString(String string) {
		return string != null && !string.isEmpty();
	}

	public static CommonResponseModel throwError(int code, String message) {
		throw new WebApplicationException(Response.status(code).entity(new CommonResponseModel(code, message))
				.type(MediaType.APPLICATION_JSON).build());
	}

	public static void throwError(Exception exception) {
		if (exception instanceof WebApplicationException) {
			Response response = ((WebApplicationException) exception).getResponse();
			CommonResponseModel commonResponseModel = (CommonResponseModel) response.getEntity();
			throwError(commonResponseModel.getCode(), commonResponseModel.getMessage());
		} else {
			throw new WebApplicationException(exception);
		}
	}
}
