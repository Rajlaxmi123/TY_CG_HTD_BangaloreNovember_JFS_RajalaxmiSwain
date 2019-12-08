package com.capgemini.ppc.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.ppc.Bean.CustomerBean;

public class CustomerDAOImpl implements CustomerDAO{

	private List<CustomerBean> customerBeans = new ArrayList<CustomerBean>();

	Scanner sc = new Scanner(System.in);


	@Override
	public boolean addCustomer(CustomerBean bean) {
		for (CustomerBean customerBean : customerBeans) {
			if(customerBean.getCustId()== bean.getCustId()) {
				return false;
			}
		}
		customerBeans.add(bean);
		return true;
	}	










	@Override
	public boolean deleteCustomer(int custid) {
		CustomerBean bean = null;//creating this variable locally
		for (CustomerBean customerBean : customerBeans) {
			if(customerBean.getCustId()== custid) {
				bean = customerBean;
			}
		}
		if(bean!=null)
		{
			customerBeans.remove(bean);
			return true;
		}
		return false;
	}









	@Override
	public boolean modifyCustomer(int custid) {
		while(true)
		{
			System.out.println("Press 1 to update customer name");
			System.out.println("Press 2 to update customer street adress1");
			System.out.println("Press 3 to update customer street adress2");
			System.out.println("Press 4 to update customer town");
			System.out.println("Press 5 to update customer postal code");
			System.out.println("Press 6 to update customer email");
			System.out.println("Press 7 to update customer phoneno");

			int ch = sc.nextInt();


			switch(ch) {
			case 1:
				System.out.println("Enter the new Customer name");
				updateName(custid,sc.next());
				break;

			case 2:
				System.out.println("enter the new Street Adress1");
				updateAdress1(custid,sc.next());
				break;

			case 3:
				System.out.println("Enter the new Street Adress2");
				updateAdress2(custid,sc.next());
				break;
			case 4:
				System.out.println("Enter the new town name");
				updatetown(custid,sc.next());
				break;

			case 5:
				System.out.println("Enter the new Postal Code");
				updatePostalCode(custid,sc.nextInt());
				break;
			case 6:
				System.out.println("Enter the new Email");
				updateEmail(custid,sc.next());
				break;
			case 7:
				System.out.println("Enter the new PhoneNumber");
				updatePhoneNo(custid,sc.nextInt());
				break;
			}
			
			return true;
		}

		
	}




	private boolean updateEmail(int custid1, String newemail) {
		// TODO Auto-generated method stub
		for(int i=0;i<customerBeans.size();i++)
		{
			if(customerBeans.get(i).getCustId()==custid1)
			{
				customerBeans.get(i).setEmail(newemail);;
			}
			return true;
		}
		return false;
	}










	private boolean updatePhoneNo(int custId1, int newphoneno) {

		for(int i=0;i<customerBeans.size();i++)
		{
			if(customerBeans.get(i).getCustId()==custId1)
			{
				customerBeans.get(i).setPhoneNo(newphoneno);
			}
			return true;
		}
		return false;
	}










	private boolean updatePostalCode(int custId1, int newpostcode) {
		for(int i=0;i<customerBeans.size();i++)
		{
			if(customerBeans.get(i).getCustId()==custId1)
			{
				customerBeans.get(i).setPostalCode(newpostcode);
			}
			return true;
		}
		return false;

	}










	private boolean updatetown(int custId1, String newtown) {
		for(int i=0;i<customerBeans.size();i++)
		{
			if(customerBeans.get(i).getCustId()==custId1)
			{
				customerBeans.get(i).setTown(newtown);;
			}
			return true;
		}
		return false;

	}










	private boolean updateAdress2(int custId1, String newadress2) {
		for(int i=0;i<customerBeans.size();i++)
		{
			if(customerBeans.get(i).getCustId()==custId1)
			{
				customerBeans.get(i).setStreetAdress2(newadress2);;
			}
			return true;
		}
		return false;

	}










	private boolean updateAdress1(int custId1, String newadress1) {
		for(int i=0;i<customerBeans.size();i++)
		{
			if(customerBeans.get(i).getCustId()==custId1)
			{
				customerBeans.get(i).setStreetAdress1(newadress1);;
			}
			return true;
		}
		return false;

	}










	private boolean updateName(int custId1, String newname) {
		for(int i=0;i<customerBeans.size();i++)
		{
			if(customerBeans.get(i).getCustId()==custId1)
			{
				customerBeans.get(i).setCustName(newname);;
			}
			return true;
		}
		return false;

	}











	@Override
	public List<CustomerBean> getAllCustomer() {

		return customerBeans;
	}

}
