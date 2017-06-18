package com.sm.api;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.sm.models.CommonResponseModel;
import com.sm.services.school.SchoolUtils;
import com.sm.services.school.models.SchoolDetailModel;

@Path("/school")
@Produces(MediaType.APPLICATION_JSON)
public class SchoolAPIs {

	@POST
	@Path("/signUp")
	public CommonResponseModel signUp(SchoolDetailModel schoolDetailModel,@Context HttpServletRequest request) {
		 return new SchoolUtils().signUp(schoolDetailModel,request);
	} 
	
	@GET
	@Path("/getSchoolDetail")
	public CommonResponseModel getSchoolDetails(@Context HttpServletRequest request) {
		 return new SchoolUtils().getSchoolDetails(request);
	} 
}
