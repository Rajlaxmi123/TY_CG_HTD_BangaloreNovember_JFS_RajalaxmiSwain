package com.capgemini.ppc.App;

import java.util.List;
import java.util.Scanner;

import com.capgemini.ppc.Bean.CustomerBean;
import com.capgemini.ppc.Bean.ProductBean;
import com.capgemini.ppc.DAO.ProductDAO;
import com.capgemini.ppc.factory.ProductManager;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDAO dao = ProductManager.getProductDAO();

		while(true) {
			System.out.println("----------------------------------------");
			System.out.println(" Press 1 to insert product details");
			System.out.println("Press 2 to delete product details");
			System.out.println("Press 3 to modify product details");
			System.out.println("Press 4 to show product details");
			

			Scanner sc = new Scanner(System.in);

			int choice = sc.nextInt();
			switch(choice)
			{

			case 1: System.out.println("Enter product id");
			int prodId = sc.nextInt();
			

			ProductBean bean = new ProductBean();

			bean.setProdId(prodId);;
			

			boolean check = dao.addProduct(bean);

			if (check)
			{
				System.out.println(" product details added to list");
			}
			else
			{
				System.err.println(" product details already exist !!!!!");
			}

			break;

			
			case 2: System.out.println("Enter product Id");
			int No1 = sc.nextInt();

			boolean check1 = dao.deleteProduct(No1);

			if(check1)
			{
				System.out.println(" product details deleted from  list");
			}
			else
			{
				System.err.println(" product details doesnot exist !!!!!");
			}	 
			break;

			
			case 3:
				    System.out.println("Enter productId to update");
				int prodId1 = sc.nextInt();
				 boolean check2 = dao.modifyProduct(prodId1);
				 if(check2)
					{
						System.out.println("modified successfully.......");
					}
					else
					{
						System.err.println(" something went wrong !!!!!");
					}	 
				break;
				
			case 4:List<ProductBean> list = dao.getAllProduct();
	        if(list !=null) {
	        	for(ProductBean productBeans : list) {
	        		System.out.println(productBeans);
	        	}
	        }

			}

		}


		
		
		
		
		
		
		
		
		
		
		
	}

}
