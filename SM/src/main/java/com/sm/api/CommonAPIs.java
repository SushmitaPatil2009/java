package com.sm.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sm.models.CommonResponseModel;
import com.sm.services.common.GenericUtils;

@Path("/common")
@Produces(MediaType.APPLICATION_JSON)
public class CommonAPIs {

	@GET
	@Path("/search/{searchTerm}")
	public CommonResponseModel searchUser(@PathParam("searchTerm") String searchTerm) {
		System.out.println("Sushmita");
		return new GenericUtils().searchUser(searchTerm);
	}
}
