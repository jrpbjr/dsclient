package com.dev.dsclient.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6078848430985288942L;
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}

}
