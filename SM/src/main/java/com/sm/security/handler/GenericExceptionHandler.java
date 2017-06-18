package com.sm.security.handler;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GenericExceptionHandler extends Throwable implements ExceptionMapper<Throwable> {
	private static final long serialVersionUID = 1L;

	@Override
	public Response toResponse(Throwable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
