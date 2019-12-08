package com.capgemini.ppc.App;

import java.util.List;
import java.util.Scanner;

import com.capgemini.ppc.Bean.ContractBean;
import com.capgemini.ppc.Bean.CustomerBean;
import com.capgemini.ppc.DAO.ContractDAO;

import com.capgemini.ppc.factory.ContractManager;


public class ContractApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContractDAO dao = ContractManager.getContractDAO();

		while(true) {
			System.out.println("----------------------");
			System.out.println(" Press 1 to insert contract data");
			System.out.println("Press 2 to delete contract data");
			System.out.println("Press 3 to show all the contract details");
			

			Scanner sc = new Scanner(System.in);

			int choice = sc.nextInt();
			switch(choice)
			{

			case 1: System.out.println("Enter contract no");
			int contractno = sc.nextInt();
			System.out.println("Enter customer Id");
			int custId = sc.nextInt();
			System.out.println("Enter product Id");
			int prodId = sc.nextInt();
			System.out.println("enter the haulierId ");
			int haulierId =sc.nextInt();
			System.out.println("enter the delivery date ");
			String deliveryDate = sc.next();
			System.out.println("enter the delivery day ");
			String deliveryDay = sc.next();
			System.out.println("enter the quantity ");
			int quantity= sc.nextInt();

			ContractBean bean = new ContractBean();

			bean.setContractNo(contractno);
			bean.setCustomerId(custId);
			bean.setProdId(prodId);
			bean.setHaulierId(haulierId);
			bean.setDeliveryDate(deliveryDate);
			bean.setDeliveryDay(deliveryDay);
			bean.setQuantity(quantity);
			

			boolean check = dao.addContract(bean);

			if (check)
			{
				System.out.println(" contract details added to list");
			}
			else
			{
				System.err.println(" contract details already exist !!!!!");
			}

			break;

			
			case 2: System.out.println("Enter contract no");
			int No1 = sc.nextInt();

			boolean check1 = dao.deleteContract(No1);

			if(check1)
			{
				System.out.println(" contract details deleted from  list");
			}
			else
			{
				System.err.println(" contract details doesnot exist !!!!!");
			}	 
			break;

			case 3:List<ContractBean> list = dao.getAllContract();
	        if(list !=null) {
	        	for(ContractBean contractBeans : list) {
	        		System.out.println(contractBeans);
	        	}
	        }
	

			}

		}



	}

}
