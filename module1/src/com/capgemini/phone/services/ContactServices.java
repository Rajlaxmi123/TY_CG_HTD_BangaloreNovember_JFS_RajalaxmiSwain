package com.capgemini.phone.services;

import java.util.List;

import com.capgemini.phone.Bean.Contact;

public interface ContactServices {

	
	List<Contact> getAllContacts();
	public boolean search(String name);
	
	public boolean insert(Contact contact);
	public boolean delete( String name);
	public boolean update(String name,Long phoneNo);
	
	
	
	
}
