package com.sm.api;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.sm.models.CommonResponseModel;
import com.sm.services.login.LoginUtils;
import com.sm.services.login.models.LoginModel;

@Path("/login")
@Produces(MediaType.APPLICATION_JSON)
public class LoginAPIs {

	@POST
	public CommonResponseModel validateUser(LoginModel loginModel, @Context HttpServletRequest request) {
		return new LoginUtils().validateUser(loginModel, request);
	}
}
