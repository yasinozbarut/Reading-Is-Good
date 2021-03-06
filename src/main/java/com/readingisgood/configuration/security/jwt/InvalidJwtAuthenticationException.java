package com.readingisgood.configuration.security.jwt;

import org.springframework.security.core.AuthenticationException;

class InvalidJwtAuthenticationException extends AuthenticationException {

    private static final long serialVersionUID = -761503632186596342L;

    InvalidJwtAuthenticationException(String e) {
        super(e);
    }
}
