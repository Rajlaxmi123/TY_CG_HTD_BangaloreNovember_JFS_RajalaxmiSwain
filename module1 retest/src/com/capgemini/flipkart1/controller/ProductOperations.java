package com.capgemini.flipkart1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.flipkart1.App.FlipkartApp;
import com.capgemini.flipkart1.bean.ProductBean;
import com.capgemini.flipkart1.factory.ProductFactory;
import com.capgemini.flipkart1.services.ProductServices;

public class ProductOperations {

	public static void main(String[] args) {
	ProductServices services = ProductFactory.instanceOfProductServicesImpl();
	Scanner sc = new Scanner(System.in);
	
	
	
	while(true)
	{ 
		System.out.println("PRESS 1 TO INSERT PRODUCT");
		System.out.println("PRESS 2 TO SHOW ALL THE PRODUCT INFORMATION");
	
	System.out.println("PRESS 3 TO SEARCH PRODUCT INFORMATION BY NAME");
	System.out.println("PRESS 4 TO go back to homepage");
	
	
	
	
	int result = sc.nextInt();
	
	
	
	switch(result) {
	
	case 1:System.out.println("Enter all the details");
	ProductBean product3 =   new ProductBean();
	System.out.println("Enter product  id");
	product3.setId(sc.nextInt());
	System.out.println("Enter product  name");
	product3.setName(sc.next());
	System.out.println("Enter product color");
	product3.setColor(sc.next());
	System.out.println("Enter product cost");
	product3.setCost(sc.nextDouble());
	System.out.println("Enter product description");
	product3.setDescription(sc.next());
	System.out.println("Enter no of products");
	product3.setNo(sc.nextInt());
	
	if(services.insert(product3))
	{
		System.out.println("product details inserted....");
	}
	else
	{
		System.err.println(" Something went wrong");


	}

	break;
	
	case 2:List<ProductBean> list1 = services.getAllProducts();
	for(ProductBean product2 : list1)
	{
		if(list1 != null) {
			System.out.println("product name"+product2.getName());
		System.out.println("product color : "+product2.getColor());
		System.out.println("product cost :"+product2.getCost());
		System.out.println("product description : "+product2.getDescription());
		System.out.println("No of products : "+product2.getNo());
	}else
	{
		System.out.println("product details not found.........");
	}
	}
		break;
		
		
		case 3: System.out.println("Enter name of product");
String name=sc.next();

ProductBean product1 = new ProductBean();
product1.setName(name);
List<ProductBean> list = services.search(name);
for(ProductBean product : list)
{
	if(list != null) {
	System.out.println("product color : "+product.getColor());
	System.out.println("product cost :"+product.getCost());
	System.out.println("product description : "+product.getDescription());
	System.out.println("No of products : "+product.getNo());
         }else
{
	System.out.println("product doesnot exist.......");
}
}
	break;
		case 4:FlipkartApp.main(args);
	
	
	default :System.exit(0);






	}
	}
	
	
	
	
	}

}
