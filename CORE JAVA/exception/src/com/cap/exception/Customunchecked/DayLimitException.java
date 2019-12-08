package com.cap.exception.Customunchecked;

public class DayLimitException extends RuntimeException {
	String msg="exceeds daylimit" ;

	public DayLimitException() {
		
	}

	public DayLimitException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMessage() {
		return this.msg;
	}
	

}
