package com.sm.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;


/**
 * @author Sushmita
 */
public class CorsFilter implements ContainerResponseFilter {

	public void filter(ContainerRequestContext requestContext, ContainerResponseContext cresp) throws IOException {
		MultivaluedMap<String, Object> headers = cresp.getHeaders();
		headers.add("Access-Control-Allow-Origin", "*");
		headers.add("Access-Control-Allow-Credentials", "true");
		headers.add("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS, HEAD");
		headers.add("Access-Control-Allow-Headers",
				"Content-Type, Accept, X-Requested-With,access_token,hash,expiry,token,role_id");
		headers.add("Access-Control-Max-Age", "151200");
		headers.add("Access-Control-Expose-Headers", "token,hash");

	}

}
