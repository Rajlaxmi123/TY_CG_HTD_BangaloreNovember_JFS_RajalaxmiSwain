package com.capgemini.flipkart1.services;

import java.util.List;

import com.capgemini.flipkart1.bean.ProductBean;
import com.capgemini.flipkart1.dao.ProductDAO;
import com.capgemini.flipkart1.factory.ProductFactory;

public class ProductServicesImpl implements ProductServices {
	
	ProductDAO dao = ProductFactory.instanceOfProductDAOImpl();

	@Override
	public List<ProductBean> getAllProducts() {
	
		return dao.getAllProducts();
	}

	@Override
	public List<ProductBean> search(String name) {
		
		return dao.search(name);
	}

	@Override
	public boolean insert(ProductBean product) {
		// TODO Auto-generated method stub
		return dao.insert(product);
	}

}
