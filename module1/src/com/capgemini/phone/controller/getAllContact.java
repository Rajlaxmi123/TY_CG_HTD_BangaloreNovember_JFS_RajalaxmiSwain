package com.capgemini.phone.controller;

import java.util.List;

import com.capgemini.phone.Bean.Contact;
import com.capgemini.phone.factory.PhoneFactory;
import com.capgemini.phone.services.ContactServices;

public abstract class getAllContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactServices services = PhoneFactory.instanceOfContactServicesImpl();

		
		
		Contact contact2 =   new Contact();
		List<Contact> list = services.getAllContacts();
		if(list !=null) {
			for(Contact contract3 : list) {
				System.out.println(contract3);

			}
		}
		
		
		
		
		
	}

}
