package com.capgemini.retailer.dao;

import com.capgemini.retailer.dto.ProductInfo;

public interface ProductDAO {
	public boolean addProduct(ProductInfo product);
	public ProductInfo search(int id);
}
