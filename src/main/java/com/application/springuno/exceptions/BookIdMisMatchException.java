package com.application.springuno.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpServerErrorException;

public class BookIdMisMatchException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public BookIdMisMatchException() {
		super("Error: No coinciden los ids del elemento", new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR));
	}

	public BookIdMisMatchException(String message, Throwable cause) {
		super(message, cause);
	}
}
