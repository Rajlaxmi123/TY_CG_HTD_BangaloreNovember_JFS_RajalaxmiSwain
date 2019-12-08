package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.services.UserServices;
import com.caps.jdbc.factory.UserFactory;

public class DeleteUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		UserServices services = UserFactory.instanceOfUserServices();
		UserBean user =   new UserBean();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter userid....");
		user.setUserid(Integer.parseInt(sc.nextLine()));
		
		System.out.println("enter password.");
		user.setPassword(sc.nextLine());
		
		boolean result = services.deleteUser(user.getUserid(), user.getPassword(), user.getEname());
		if(result)
		{
			System.out.println("user deleted.");
		}
		else
		{
			System.err.println(" User not found");
		
		
	}
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
