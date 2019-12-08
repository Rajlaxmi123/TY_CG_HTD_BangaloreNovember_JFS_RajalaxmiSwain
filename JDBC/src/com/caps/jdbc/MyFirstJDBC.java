package com.caps.jdbc;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MyFirstJDBC {

	public static void main(String[] args) {
		
		Connection conn =  null;
		Statement stmt = null;
		ResultSet rs = null;
		
try {
	//Load the driver
	//Driver driver = new com.mysql.jdbc.Driver();
	//DriverManager.registerDriver(driver);
	Class.forName("com.mysql.jdbc.Driver"); 
	System.out.println("Driver Loaded");
	
	//Get DBConnection via Driver
	
	String dbUrl ="jdbc:mysql://localhost:3306/ty_cg_nov6"+"?user=root&password=root";
	conn = DriverManager.getConnection(dbUrl);
	System.out.println("connection established");
	
	
	//Issue SQL Query via connection
	
	String query = "SELECT * FROM users_info";
	stmt = conn.createStatement();//createstatement is present in java.sql.statement...returns java.sql.statement type
	
	rs =stmt.executeQuery(query);
	System.out.println("Querry Issued");
	System.out.println("***************************");
	
	//Process the result returned
	while(rs.next())
	{
		System.out.println("Userid : "+rs.getInt("userid")); /// called as getxxx method
		System.out.println("UserName : " +rs.getString("username"));
		System.out.println("Ename :" +rs.getString("ename"));
		
	
		System.out.println("*****************");
		

	}
	
	
	
	
	
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
			if(stmt != null) {
			stmt.close();
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





//Close all JDBC Objects


	}

}
