package com.cap.checkedexception.customchecked;

public class AgeLimitException extends Exception {
	String msg ="Age should be more than 18";
	
	

	public AgeLimitException() {
		super();
		
	}

	public AgeLimitException(String msg) {
		super();
		this.msg = msg;
	}
	
 public String getMessage()
{
	return this.msg;
}
	
	
	
	
	
	
	
}
