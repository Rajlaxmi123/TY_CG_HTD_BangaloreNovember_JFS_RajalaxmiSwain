package com.capgemini.phone.controller;

import java.util.Scanner;

import com.capgemini.phone.Bean.Contact;
import com.capgemini.phone.factory.PhoneFactory;
import com.capgemini.phone.services.ContactServices;

public class ContractOperartions {

	public static void main(String[] args) {
		ContactServices services = PhoneFactory.instanceOfContactServicesImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 to insert a contact");
		System.out.println("enter 2 to delete a contact");
		System.out.println("enter 3 to edit a contact");
		
		int result= sc.nextInt();
		switch(result)
		{
		
	case 1: 
		Contact contact =   new Contact();

		System.out.println("Enter contact name");
		contact.setName(sc.next());
		System.out.println("Enter contact phoneno");
		contact.setPhoneno(sc.nextLong());
		System.out.println("Enter contact group");
		contact.setGroup1(sc.next());
		



		if(services.insert(contact))
		{
			System.out.println("contact details inserted....");
		}
		else
		{
			System.err.println(" Something went wrong");


		}

		break;


	case 2:
		Contact contact2 =   new Contact();

		System.out.println("Enter contact name");
	contact2.setName(sc.next());


	boolean result5 = services.delete(contact2.getName());
	if(result5)
	{
		System.out.println("contact details deleted.");
	}
	else
	{
		System.err.println(" Contact Details not found");


	}

	break;




	case 3:Contact contact3 =   new Contact();

	System.out.println("Enter contact name");
contact3.setName(sc.next());


boolean result4 = services.update(contact3.getName(),contact3.getPhoneNo());
if(result4)
{
	System.out.println("contact details updated.");
}
else
{
	System.err.println(" Contact Details not found");


}

	
	
	break;

	default: System.exit(0);
	}




		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
