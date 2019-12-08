package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {

	public static void main(String[] args) {
		
				
				
				
				//Close all JDBC Objects
		
		//Load the driver
		Connection conn = null;
		Scanner sc = new Scanner (System.in);
		PreparedStatement pstmt = null;
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver has been loaded");
			
			//Get DBConnection via Driver
			String dbUrl ="jdbc:mysql://localhost:3306/ty_cg_nov6"+"";
			System.out.println("enter DB user and password");
			
			String dbuser = sc.nextLine();
			String dbpass = sc.nextLine();
			
			
			conn = DriverManager.getConnection(dbUrl,dbuser,dbpass);
			
			System.out.println("Connection established..........");
			
			//Issue SQL Query via connection
			
			String query = "update users_info set ename = ?  where userid = ? and password =?";
			
			pstmt = conn.prepareStatement(query);
			System.out.println(" Enter userid..");
			
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			
			System.out.println("Enter the new ename....");
			
			pstmt.setString(1, sc.nextLine());
			System.out.println("Enter the password to updATE");
			
			pstmt.setString(3, sc.nextLine());
			
			int count = pstmt.executeUpdate();
			System.out.println("THE QUERRY HAS BEEN ISSUED");
			
			
			//Process the result returned
			
			if(count> 0)
			{
				System.out.println("Querry Ok" +count + "  rows affected ");
			}else
				System.out.println("something went wrong");
		
			
			
			
			
			
			
			
			
			sc.close();
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
			
			
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



		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
