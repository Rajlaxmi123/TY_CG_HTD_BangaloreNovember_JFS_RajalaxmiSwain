package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.services.UserServices;
import com.caps.jdbc.factory.UserFactory;

public class UserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
UserServices services = UserFactory.instanceOfUserServices();
UserBean user =   new UserBean();



System.out.println(" enter userid....");
user.setUserid(Integer.parseInt(sc.nextLine()));


System.out.println("enter password.");
user.setPassword(sc.nextLine());


if(user != null)
{
	
	System.out.println("LOGIN SUCCESSFUL..........");
}
else
{
	System.err.println(" Something went wrong");
}
		
	}

}
