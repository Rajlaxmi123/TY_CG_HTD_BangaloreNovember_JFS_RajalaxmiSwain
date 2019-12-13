package com.capgemini.phone.services;

import java.util.List;

import com.capgemini.phone.Bean.Contact;
import com.capgemini.phone.dao.ContactDAO;
import com.capgemini.phone.factory.PhoneFactory;

public class ContactServicesImpl implements ContactServices{
	ContactDAO dao = PhoneFactory.instanceofContactDAOImpl();

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return dao.getAllContacts();
	}

	@Override
	public boolean insert(Contact contact) {
		// TODO Auto-generated method stub
		return dao.insert(contact);
	}

	@Override
	public boolean delete(String name) {
		// TODO Auto-generated method stub
		return dao.delete(name);
	}

	@Override
	public boolean update(String name, Long phoneNo) {
		// TODO Auto-generated method stub
		return dao.update(name, phoneNo);
	}

	@Override
	public boolean search(String name) {
		// TODO Auto-generated method stub
		return dao.search(name);
	}

}
