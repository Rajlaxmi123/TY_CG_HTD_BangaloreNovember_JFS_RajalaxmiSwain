package com.capgemini.phone.phoneApp;

import java.util.Scanner;

import com.capgemini.phone.controller.ContractOperartions;
import com.capgemini.phone.controller.getAllContact;

public class PhoneApp {

	public static void main(String[] args) {
		
		
		
		System.out.println("Welcome to Phone App");
		System.out.println("Press 1 to show all contacts");
		System.out.println(" Press 2 to Search for contacts");
		System.out.println("Press 3 to operate on contacts");
		System.out.println("---------------------------------");
		
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		switch(result)
		{
		case 1: getAllContact.main(args);
		break;
			
			
		case 2:System.out.println("Press 1 to call");
		System.out.println(" Press 2 to message");
		System.out.println("Press 3 to go back ");
		
		int result1 = sc.nextInt();
		switch(result1)
		{
		case 1:System.out.println(" User calling..................");
		       System.out.println("Call ended");
		       break;
		       
		       
		case 2:   System.out.println(" Enter your message here");
		String m = sc.next()  ;
		System.out.println(" Text Sent.............");
		break;
		
		
		case 3: PhoneApp.main(args);
		break;
		
		
		}
		
		
		case 3:ContractOperartions.main(args);
		break;
		    
		       
		       
		       
		       
		       
		       
		       
		       
		       
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
