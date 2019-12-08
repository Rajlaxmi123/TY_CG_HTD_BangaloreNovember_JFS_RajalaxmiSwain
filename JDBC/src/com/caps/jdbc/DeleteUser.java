package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		//Load the driver
		
		try {
			//Driver driver = new com.mysql.jdbc.Driver();
		//DriverManager.registerDriver(driver);
			
			Class.forName("com.mysql.jdbc.Driver");   //we can write this in place of above two sentence
			System.out.println("Driver Loaded");
			
			
			//Get DBConnection via Driver
			String dbUrl ="jdbc:mysql://localhost:3306/ty_cg_nov6"+"";
			System.out.println("enter DB user and password");
			
			String dbuser = sc.nextLine();
			String dbpass = sc.nextLine();
			
			
			conn = DriverManager.getConnection(dbUrl,dbuser,dbpass);
			System.out.println("connection established");
			
			//Issue SQL Query via connection
			
			String query = "DELETE  FROM users_info where userid = ? AND password = ?";
	           //we will go for userid coz its a primary key
	//userid is unique
	
	pstmt = conn.prepareStatement(query);
	System.out.println("enter Userid......");
	pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
	System.out.println("enter pASSWORD");
	pstmt.setString(2, sc.nextLine());
	
	
	int count = pstmt.executeUpdate();
	
	
	
	if (count > 0)
	{
		System.out.println("UserDeleted.......");
	}else
	{
		System.err.println("Something went wrong......");
	}
	
	
	
	System.out.println("Querry Issued and executed ");
	System.out.println("***************************");
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			
			try {
				if(conn != null) {
				conn.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			
			
			try {
				if(pstmt != null) {
				pstmt.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			
			
			
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				//Process the result returned
				//Close all JDBC Objects
		
		
		
		
		
		
		
		

	}

}
