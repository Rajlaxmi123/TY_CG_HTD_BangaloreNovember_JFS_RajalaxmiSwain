package com.caps.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.DriverManager;
import java.util.Properties;
import java.sql.ResultSet;
import java.sql.Statement;


import java.sql.Connection;

public class EvolvedJDBCv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		FileReader reader = null;
		Properties prop = null;
		
		
		
try {
	//load the driver
	 reader = new FileReader("C:\\Users\\SKSWAIN\\Desktop\\db.properties");
	 prop = new Properties();
	prop.load(reader);
	
	Class.forName(prop.getProperty("driverClass"));
	
	System.out.println("Driver  loaded..........");
	
	
	
	
	
	
	
	
	
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(prop.getProperty("query1"))
){
	while(rs.next())
	{
		System.out.println("Userid : "+rs.getInt("userid")); 
		System.out.println("UserName : " +rs.getString("username"));
		System.out.println("Ename :" +rs.getString("ename"));
		
	
		System.out.println("*****************");
		

	}
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
