package com.capgemini.flipkart1.App;

import java.util.Scanner;

import com.capgemini.flipkart1.controller.ProductOperations;

public class FlipkartApp {

	public static void main(String[] args) {

		while(true)
		{
			Scanner sc =  new Scanner(System.in);
			System.out.println("Press 1 to show all items");
			System.out.println("Press 2 Search for items");

			int s1 = sc.nextInt();
			switch(s1)
			{
			case 1:ProductOperations.main(args);


			case 2:

		    System.out.println("press 2 to search again");
			System.out.println("press 1 to buy all the products");
			System.out.println("press 2 to search again");
			System.out.println("press 3 to go back to last menu");

			int s2= sc.nextInt();
			switch(s2)
			{
			case 1:System.out.println("enter no of products");
			int no1 =sc.nextInt();
			if(no1 >0)
			{
				System.out.println("enter productId");
				int prodId = sc.nextInt();

				System.out.println("enter 16 digit card number");
				long cardno=sc.nextLong();
				System.out.println("enter CVV no(3 didgit)");
				int cvv = sc.nextInt();

				System.out.println("enter adresss");
				String ad = sc.next();

				System.out.println("Thank You for buying the Product");

			}
			break;


			case 2:System.out.println("search for product.");
			ProductOperations.main(args);
			break;

			case 3:System.out.println("go back to last menu");
			FlipkartApp.main(args);

			default :System.exit(0);

			}

			break;

			default:System.exit(0);


			}
























		}



	}

}
