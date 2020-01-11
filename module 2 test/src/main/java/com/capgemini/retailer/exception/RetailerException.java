package com.capgemini.retailer.exception;

public class RetailerException extends RuntimeException{
	String message;
	public RetailerException(String message) {
		super(message);
	}
}
