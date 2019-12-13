package com.capgemini.phone.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import javax.management.Query;

import com.capgemini.phone.Bean.Contact;
import com.mysql.jdbc.Driver;

public class ContactDAOImpl implements ContactDAO{

	
	FileReader reader ;
	Scanner sc = new Scanner(System.in);
	Connection  conn =  null;
	Properties prop = null;
	
	
	
	public ContactDAOImpl(){
		
			try {
				reader= new FileReader("/phone/db2.properties");
				prop=new Properties();
			     prop.load(reader);
				Class.forName(prop.getProperty("driverClass"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
		
	}
	
	
	
	
	
	@Override
	public List<Contact> getAllContacts() {
		
		
				
				 List<Contact> list = new ArrayList<Contact>();
			      
			      
			      try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
			    		  Statement stmt = conn.createStatement();
			    			ResultSet rs = stmt.executeQuery(prop.getProperty("selectQuery"))
			    					
			    	
			      ){
			    			while(rs.next())
			    			{
			    			Contact	contact =  new Contact();
			    			contact.setName(rs.getString(1));
			    			contact.setPhoneno(rs.getLong(2));
			    			contact.setGroup1(rs.getString(3));
			    				
			    				list.add(contact);
			    				
			    			}
			    			return list;
			    			
				
				
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public boolean search(String name) {
		
		return false;
	}

	@Override
	public boolean insert(Contact contact) {
		
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
	    		  
				  PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertQuery")))
						  {
								
								pstmt.setString(1,contact.getName());
								pstmt.setString(3,contact.getGroup1());
								pstmt.setLong(2,contact.getPhoneNo());
								
								int count = pstmt.executeUpdate();
								if (count> 0 )
								{
									return true;
								}
	}catch(Exception e)
	{
		e.printStackTrace();
	}
		return false;
	}







	@Override
	public boolean delete(String name) {
try(
				
				Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
	  		  
				  PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteQuery"))
				
				
				
				
				
				){
			
			
			
			
			pstmt.setString(1, name);
			
			
			int count = pstmt.executeUpdate();
			if (count> 0 )
			{
				return true;
			}
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
		return false;
	}





	@Override
	public boolean update(String name, Long phoneNo) {
try(
				
				Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
	  		  
				  PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("updateQuery"))
				
				
				
				
				
				){
			
			
			
			
			

			pstmt.setString(2,name);
			pstmt.setLong(1,phoneNo);
			
			int count = pstmt.executeUpdate();
			if (count> 0 )
			{
				return true;
			}
		
		
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}


}
