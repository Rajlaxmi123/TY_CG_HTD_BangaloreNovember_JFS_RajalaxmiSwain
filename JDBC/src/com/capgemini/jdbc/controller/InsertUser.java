package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.services.UserServices;
import com.caps.jdbc.factory.UserFactory;

public class InsertUser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserServices services = UserFactory.instanceOfUserServices();
		UserBean user =   new UserBean();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter userid....");
		user.setUserid(Integer.parseInt(sc.nextLine()));
		
		System.out.println("enter username");
		user.setUsername(sc.nextLine());
		System.out.println(" enter ename...");
		user.setEname(sc.nextLine());
		
		System.out.println("enter password.");
		user.setPassword(sc.nextLine());
		
		
		if(services.insertUser(user))
		{
			System.out.println("user inserted....");
		}
		else
		{
			System.err.println(" Something went wrong");
		
		
	}
		sc.close();
	}
}
