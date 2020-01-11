package com.capgemini.retailer.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.retailer.dto.ProductResponse;
import com.capgemini.retailer.exception.RetailerException;

@RestControllerAdvice
public class ProductControllerAdvice {
	@ExceptionHandler(RetailerException.class) 
	public ProductResponse handleException(RetailerException  e) {
		ProductResponse response = new ProductResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}
}
