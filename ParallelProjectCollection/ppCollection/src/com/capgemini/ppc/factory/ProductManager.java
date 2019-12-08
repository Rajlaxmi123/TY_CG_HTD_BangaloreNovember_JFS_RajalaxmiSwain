package com.capgemini.ppc.factory;


import com.capgemini.ppc.DAO.ProductDAO;
import com.capgemini.ppc.DAO.ProductDAOImpl;

public class ProductManager {
	public static ProductDAO getProductDAO()
	{
		return new ProductDAOImpl();
	}
}
