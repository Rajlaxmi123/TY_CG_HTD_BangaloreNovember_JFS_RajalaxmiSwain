package com.capgemini.retailer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailer.dao.ProductDAO;
import com.capgemini.retailer.dto.ProductInfo;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDAO dao;
	@Override
	public boolean addProduct(ProductInfo product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}

	@Override
	public ProductInfo search(int id) {
		// TODO Auto-generated method stub
		return dao.search(id);
	}

}
