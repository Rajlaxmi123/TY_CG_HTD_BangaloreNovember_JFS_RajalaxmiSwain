package com.capgemini.flipkart1.services;

import java.util.List;

import com.capgemini.flipkart1.bean.ProductBean;

public interface ProductServices {
	List<ProductBean> getAllProducts();
	List<ProductBean> search(String name);
	public boolean insert(ProductBean product);
}
