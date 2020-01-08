package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.product.dao.ProductDAO;
import com.capgemini.product.dto.Product;

@Service
public class ProductServicesImpl implements ProductServices{
	@Autowired
	private ProductDAO dao;

	@Override
	public boolean addProduct(Product product) {

		return dao.addProduct(product);
	}

	@Override
	public Product getProduct(int id) {
		
		return dao.getProduct(id);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return dao.getAllProducts();
	}

	@Override
	public boolean deleteProduct(int id) {
		
		return dao.deleteProduct(id);
	}


}
