package com.capgemini.retailer.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.retailer.dto.OrderResponse;
import com.capgemini.retailer.dto.ProductInfo;
import com.capgemini.retailer.dto.ProductResponse;
import com.capgemini.retailer.exception.RetailerException;

@RestControllerAdvice
public class OrderControllerAdvice {
	@ExceptionHandler(RetailerException.class) 
	public OrderResponse handleException(RetailerException  e) {
		OrderResponse response = new OrderResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}
	

}
