package com.sm.security;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

public class SecurityCheck implements ContainerRequestFilter {

	public void filter(ContainerRequestContext requestContext) throws IOException {
	}
}
