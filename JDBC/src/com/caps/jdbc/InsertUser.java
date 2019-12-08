package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		//Load the driver
		
		try {
			Driver driver = new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
			
			//Class.forName("com.mysql.jdbc.Driver");   //we can write this in place of above two sentence
			System.out.println("Driver Loaded");
			
			
			//Get DBConnection via Driver
			String dbUrl ="jdbc:mysql://localhost:3306/ty_cg_nov6"+"";
			System.out.println("enter DB user and password");
			
			String dbuser = sc.nextLine();
			String dbpass = sc.nextLine();
			
			
			conn = DriverManager.getConnection(dbUrl,dbuser,dbpass);
			System.out.println("connection established");
			
			//Issue SQL Query via connection
			
			String query = " INSERT into  users_info values (?,?,?,?)";
	           //we will go for userid coz its a primary key
	//userid is unique
	
	pstmt = conn.prepareStatement(query);
	System.out.println("enter Userid......");
	pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
	System.out.println("enter username ");
	pstmt.setString(2, sc.nextLine());
	System.out.println("enter ename");
	pstmt.setString(3, sc.nextLine());
	System.out.println("enter password");
	pstmt.setString(4, sc.nextLine());
	
	
	int count = pstmt.executeUpdate();
	if (count > 0)
	{
		System.out.println("Userinserted.......");
	}else
	{
		System.err.println("Something went wrong......");
	}
	
	
	
	System.out.println("Querry Issued and executed ");
	System.out.println("***************************");
			
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
