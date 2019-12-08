package com.capgemini.ppc.Home;

import java.util.Scanner;

import com.capgemini.ppc.App.ContractApp;
import com.capgemini.ppc.App.CustomerApp;
import com.capgemini.ppc.App.ProductApp;

public class HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for contract details");
		System.out.println("Enter 2 for customer details");
		System.out.println("Enter 3 for product details");
		
		
		
		int choice = sc.nextInt();
		switch(choice)
		{
		
		case 1: ContractApp.main(args);
		        break;
		case 2: CustomerApp.main(args);
		        break;
		case 3:ProductApp.main(args);
		        break;
		        
		default:System.exit(0);
		
		
		
		}
		
		
		
		
		
		
	}

}
