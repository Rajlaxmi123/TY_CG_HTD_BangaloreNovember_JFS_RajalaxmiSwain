package com.caps.jdbc;

import java.sql.SQLException;

import java.sql.Statement;
import java.util.Scanner;

import java.sql.PreparedStatement;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class UserLogin {
	public static void main(String[] args)  {
		//Load the driver
		//Get DBConnection via Driver
		//Issue SQL Query via connection
		//Process the result returned
		//Close all JDBC Objects
		Scanner sc = new Scanner (System.in);
		Connection conn = null;
	PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			Driver driver = new com.mysql.jdbc.Driver();
			
			
			DriverManager.registerDriver(driver); //while loading  the driver , 
			//we have to invoke registerDriver method from DriverManager class presemnt inside java.sql package in order to register with the driver.
			System.out.println("Driver Loaded");
			
			String dbUrl ="jdbc:mysql://localhost:3306/ty_cg_nov6"+""; // Instead of writing here username and 
			//password we can use it inside getconnection method also
			
			
			System.out.println("enter username and password");
			String dbuser = sc.nextLine();
			String dbpass = sc.nextLine();
			
			conn = DriverManager.getConnection(dbUrl, dbuser, dbpass); //this getconnection method is more secured 
			//we need to enter UN and PW at run time , thus more secured coz anyone can get our code
			// whenever want to establish connection with the database ,
			//you need to call getconnection method
			//conn = DriverManager.getConnection(dbUrl, "root", "root" ); //can be written in this way also
			
			
			System.out.println("connection established--------------------");
			
			String query = "SELECT * FROM users_info where userid = ? AND password = ?";
			           //we will go for userid coz its a primary key
			//userid is unique
			pstmt = conn.prepareStatement(query);
			
			
			System.out.println("enter userid--------");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			
			System.out.println("enter password------");
			pstmt.setString(2, sc.nextLine());
			
			//pstmt = conn.createStatement();// isssuing the sql query via connection
			rs = pstmt.executeQuery();
			
			System.out.println("Querry Issued and executed ");
			System.out.println("***************************");
			
			
			if(rs.next()) //since the resultset is returning only one or zero row, we can go for 'If ' instead of 'while' //here we have given index of column
			{
				System.out.println("Userid : "+rs.getInt(1));
				System.out.println("UserName : " +rs.getString(2));
				System.out.println("Ename :" +rs.getString(3));
				
			
				System.out.println("*****************");
				

			}
			
			
	
			
			
		} catch (SQLException e) {
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
			
			
			
			try {
				if(rs != null) {
				rs.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		
		}


	}

}
