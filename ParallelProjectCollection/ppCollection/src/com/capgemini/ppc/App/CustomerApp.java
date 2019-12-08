package com.capgemini.ppc.App;

import java.util.List;
import java.util.Scanner;

import com.capgemini.ppc.Bean.CustomerBean;
import com.capgemini.ppc.DAO.CustomerDAO;
import com.capgemini.ppc.factory.CustomerManager;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDAO dao = CustomerManager.getCustomerDAO();

		while(true) {
			System.out.println("-------------------------------------------");
			System.out.println(" Press 1 to insert customer data");
			System.out.println("Press 2 to delete customer data");
			System.out.println("Press 3 to modify data");
			System.out.println("Press 4 to getallusers");

			Scanner sc = new Scanner(System.in);

			int choice = sc.nextInt();
			switch(choice)
			{

			case 1: System.out.println("Enter customer Id");
			int custId = sc.nextInt();
			System.out.println("Enter customer name");
			String custName = sc.next();
			System.out.println("Enter the addressline1");
			String streetAdress1 = sc.next();
			System.out.println("enter addressline2");
			String streetAdress2 = sc.next();
			System.out.println("Enter  the town name");
			String town = sc.next();
			System.out.println("Enter the postal code");
			int postalCode = sc.nextInt();
			System.out.println("enter the email address");
			String email = sc.next();
			System.out.println("enter the phone no ");
			long phoneNo = sc.nextLong();

			CustomerBean bean = new CustomerBean();

			bean.setCustId(custId);
			bean.setCustName(custName);
			bean.setStreetAdress1(streetAdress1);
			bean.setStreetAdress2(streetAdress2);
			bean.setTown(town);
			bean.setPostalCode(postalCode);
			bean.setEmail(email);
			bean.setPhoneNo(phoneNo);

			boolean check = dao.addCustomer(bean);

			if (check)
			{
				System.out.println(" customer added to list");
			}
			else
			{
				System.err.println(" customer already exist !!!!!");
			}

			break;

			
			case 2: System.out.println("Enter customer Id");
			int Id1 = sc.nextInt();

			boolean check1 = dao.deleteCustomer(Id1);

			if(check1)
			{
				System.out.println(" customer deleted from  list");
			}
			else
			{
				System.err.println(" customer doesnot exist !!!!!");
			}	 
			break;

			
			

		case 3:
			System.out.println("Enter customerId to update");
			int custId1 = sc.nextInt();
			 boolean check2 = dao.modifyCustomer(custId1);
			 if(check2)
				{
					System.out.println("modified successfully.......");
				}
				else
				{
					System.err.println(" something went wrong !!!!!");
				}	 
			break;
			
		case 4: List<CustomerBean> list = dao.getAllCustomer();
		        if(list !=null) {
		        	for(CustomerBean customerBeans : list) {
		        		System.out.println(customerBeans);
		        	}
		        }

            break;
			
			
			
			default: System.exit(0);
			
			}

		}



	}

}
