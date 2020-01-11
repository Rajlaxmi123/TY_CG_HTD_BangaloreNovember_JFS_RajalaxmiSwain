package com.capgemini.retailer.service;

import com.capgemini.retailer.dto.ProductInfo;

public interface ProductService {
	public boolean addProduct(ProductInfo product);
	public ProductInfo search(int id);
	
}
