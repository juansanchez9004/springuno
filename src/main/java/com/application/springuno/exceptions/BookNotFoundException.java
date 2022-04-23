package com.application.springuno.exceptions;

public class BookNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public BookNotFoundException() {
		super("Error: No se ha encontrado el elemento");
	}

	public BookNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
