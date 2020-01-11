package com.capgemini.retailer.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.retailer.dto.UserResponse;
import com.capgemini.retailer.exception.RetailerException;

@RestControllerAdvice
public class UserControllerAdvice {
	@ExceptionHandler(RetailerException.class) 
	public UserResponse handleException(RetailerException  e) {
		UserResponse response = new UserResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}
}
