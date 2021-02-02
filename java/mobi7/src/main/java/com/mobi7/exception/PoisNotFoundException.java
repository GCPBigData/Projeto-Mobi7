package com.mobi7.exception;

public class PoisNotFoundException  extends RuntimeException{
	
	private static final long serialVersionUID = 5754160221785019934L;

	public PoisNotFoundException(Long id) {
		super("Pois with id = " + id + " not found in database.");
	}

}
