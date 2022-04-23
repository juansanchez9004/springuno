package com.application.springuno.exceptions;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

public class BookNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public BookNotFoundException() {
		super("Error: No se ha encontrado el elemento", new NotFoundException());
	}

	public BookNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
