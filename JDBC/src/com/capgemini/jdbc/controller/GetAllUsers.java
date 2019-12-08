package com.capgemini.jdbc.controller;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.services.UserServices;
import com.caps.jdbc.factory.UserFactory;

public class GetAllUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		UserServices services = UserFactory.instanceOfUserServices();
		
		
	List<UserBean> list = services.getAllUsers();
		
		
		if(list !=  null)
		{
			for (UserBean user : list)
			{
				System.out.println(user);
			}
		}
		
		
		
		
	}

}
