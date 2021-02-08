package com.dev.dsclient.services.exceptions;

public class EntityNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6078848430985288942L;
	
	public EntityNotFoundException(String msg) {
		super(msg);
	}

}
