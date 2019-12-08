package com.capgemini.ppc.factory;

import com.capgemini.ppc.DAO.CustomerDAO;
import com.capgemini.ppc.DAO.CustomerDAOImpl;

public class CustomerManager {
public static CustomerDAO getCustomerDAO()
{
	return new CustomerDAOImpl();
}
}
