package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EvolvedJDBC {

	public static void main(String[] args) {

		
		
		
	Scanner sc = new Scanner (System.in);
			String dbUrl ="jdbc:mysql://localhost:3306/ty_cg_nov6"+"";
			System.out.println("enter DB user and password");
			
			String dbuser = sc.nextLine();
			String dbpass = sc.nextLine();
			
			
			String query = "SELECT * FROM users_info";
			
			
		try(
			Connection 	conn = DriverManager.getConnection(dbUrl,dbuser,dbpass);
			Statement	stmt = conn.createStatement();
				
				ResultSet rs =stmt.executeQuery(query))
				{	
			while(rs.next())
			{
				System.out.println("Userid : "+rs.getInt("userid")); 
				System.out.println("UserName : " +rs.getString("username"));
				System.out.println("Ename :" +rs.getString("ename"));
				
			
				System.out.println("*****************");
				

			}
			
			sc.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}



































