package com.capgemini.empspringmvc.exception;

public class EmployeeException extends RuntimeException{
	String msg;
public EmployeeException(String msg) {
	super(msg);
}
}
