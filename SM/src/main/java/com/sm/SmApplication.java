package com.sm;

import org.glassfish.jersey.server.ResourceConfig;

import com.sm.filter.CorsFilter;
import com.sm.security.SecurityCheck;
import com.sm.security.handler.GenericExceptionHandler;
import com.sm.security.handler.GenericParserHandler;


public class SmApplication extends ResourceConfig {

	
	public SmApplication() {

		register(SecurityCheck.class);
		register(GenericExceptionHandler.class);
		register(GenericParserHandler.class);
		register(CorsFilter.class);

	}
}
