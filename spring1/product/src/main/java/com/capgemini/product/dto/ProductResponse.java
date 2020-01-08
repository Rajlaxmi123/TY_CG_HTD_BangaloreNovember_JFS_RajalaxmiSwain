package com.capgemini.product.dto;

import java.util.List;

public class ProductResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<Product> product;
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
	 * @return the product
	 */
	public List<Product> getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
}
