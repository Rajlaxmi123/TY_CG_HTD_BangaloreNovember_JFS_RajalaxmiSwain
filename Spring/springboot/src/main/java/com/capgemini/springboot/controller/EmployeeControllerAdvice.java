package com.capgemini.springboot.controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.springboot.dto.EmployeeException;
import com.capgemini.springboot.dto.EmployeeResponse;

@RestControllerAdvice
public class EmployeeControllerAdvice {

	@ExceptionHandler(EmployeeException.class) //every time employee exception occurs , u have to call this method with help of this annotation
	public EmployeeResponse handleEmployeeException(EmployeeException  e)
	{
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}
}
