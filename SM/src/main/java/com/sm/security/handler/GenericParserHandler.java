package com.sm.security.handler;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

@Provider
public class GenericParserHandler implements ContextResolver<ObjectMapper> {
	private ObjectMapper mapper;

	public GenericParserHandler() {
		mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
	}

	@Override
	public ObjectMapper getContext(Class<?> type) {
		return mapper;
	}

}
