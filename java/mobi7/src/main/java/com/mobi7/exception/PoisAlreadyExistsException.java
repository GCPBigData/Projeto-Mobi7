package com.mobi7.exception;

import com.mobi7.entity.Pois;

public class PoisAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 2871523074897812823L;

	public PoisAlreadyExistsException(Pois id) {
		super("Pois id = " + id + " already exists in database.");
	}

}
