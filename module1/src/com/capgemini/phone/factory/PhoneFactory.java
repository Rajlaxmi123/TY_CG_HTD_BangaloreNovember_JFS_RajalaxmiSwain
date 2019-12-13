package com.capgemini.phone.factory;

import com.capgemini.phone.dao.ContactDAO;
import com.capgemini.phone.dao.ContactDAOImpl;
import com.capgemini.phone.services.ContactServices;
import com.capgemini.phone.services.ContactServicesImpl;

public class PhoneFactory {
	
	public static ContactDAO instanceofContactDAOImpl()
	{
		ContactDAO dao = new ContactDAOImpl();
		return dao;
	}
	
	public static ContactServices instanceOfContactServicesImpl() {
		ContactServices services =  new ContactServicesImpl();
		return services;
	}
	

}
