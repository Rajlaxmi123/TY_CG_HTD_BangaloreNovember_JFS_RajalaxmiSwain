package com.capgemini.flipkart1.factory;

import com.capgemini.flipkart1.dao.ProductDAO;
import com.capgemini.flipkart1.dao.ProductDAOImpl;
import com.capgemini.flipkart1.services.ProductServices;
import com.capgemini.flipkart1.services.ProductServicesImpl;

public class ProductFactory {
	
	public static ProductDAO instanceOfProductDAOImpl()
	{
		ProductDAO dao = new ProductDAOImpl();
		return dao;
	}
	
	public static ProductServices instanceOfProductServicesImpl()
	{
		ProductServices services = new ProductServicesImpl();
		return services;
	}

}
