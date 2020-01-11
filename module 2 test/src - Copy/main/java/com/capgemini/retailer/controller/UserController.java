package com.capgemini.retailer.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailer.dto.UserInfo;
import com.capgemini.retailer.dto.UserResponse;
import com.capgemini.retailer.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;

	@PostMapping(path="/register",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse register(@RequestBody UserInfo user) {   
		UserResponse response = new UserResponse();
		if( service.register(user)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("user registered");
		}else{
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("email already exists");
		}
		return response;

	}


	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse login(@RequestBody UserInfo credentials) {
		UserResponse response = new UserResponse();
		UserInfo account = service.login(credentials);
		if (account != null) {
			response.setStatusCode(201);
			response.setDescription("Success");
			response.setMessage("Logged in");
			response.setUser(Arrays.asList(account));
		} else {
			response.setStatusCode(405);
			response.setDescription("Failure");
			response.setMessage("Provide valid credentials");
		}
		return response;
	}
}
