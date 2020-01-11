package com.capgemini.retailer.dto;

import java.util.List;

public class UserResponse {
	private int statusCode;
	private String message;
	private String description;
	
	private List<UserInfo> user ;
	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the beans
	 */
	public List<UserInfo> getUser() {
		return user;
	}
	public void setUser(List<UserInfo> user) {
		this.user = user;
	}
	
	
}
