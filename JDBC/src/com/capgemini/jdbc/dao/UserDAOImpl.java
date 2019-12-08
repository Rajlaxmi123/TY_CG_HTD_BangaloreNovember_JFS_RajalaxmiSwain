package com.capgemini.jdbc.dao;

import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.sql.Connection;

import com.capgemini.jdbc.bean.UserBean;


public class UserDAOImpl implements UserDAO{
	
	FileReader reader;
	Properties prop;
	UserBean user;
	
	

	public UserDAOImpl(){                                          
		//since all methods are non static , we need to create object for that
		//thus creating constructor
		try {
			Class.forName("com.mysql.jdbc.Driver");
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	
	
	
	
	
	
	@Override
	public UserBean userLogin(String username, String password) {
	
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
		  		  
				  PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("loginQuery"))
						  ){
			
			pstmt.setInt(1, user.getUserid());
			pstmt.setString(2,user.getPassword());
			
		ResultSet	rs = pstmt.executeQuery();
		while(rs.next())
		{
			user =  new UserBean();
			user.setUserid(rs.getInt(1));
			user.setPassword(rs.getString(2));
			user.setUsername(rs.getString(3));
		}	
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
      
      
		return null;
	}

		
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public List<UserBean> getAllUsers() {
      List<UserBean> list = new ArrayList<UserBean>();
      
      
      try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
    		  Statement stmt = conn.createStatement();
    			ResultSet rs = stmt.executeQuery(prop.getProperty("query1"))
    					
    	
      ){
    			while(rs.next())
    			{
    				user =  new UserBean();
    				user.setUserid(rs.getInt(1));
    				user.setUsername(rs.getString(2));
    				user.setEname(rs.getString(3));
    				
    				list.add(user);//adding user to the userBean list
    				
    			}
    			return list;
    			
      }catch (Exception e) {
			
			e.printStackTrace();
		}
      
      
		return null;
	}

	
	
	
	
	@Override
	public boolean updateUser(int userid, String password, String ename) {
	try(
			
			Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
  		  
			  PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("updateQuery"))
			
			
			
			
			
			){
		
		
		
		
		pstmt.setInt(2,userid);

		pstmt.setString(1,ename);
		pstmt.setString(3,password);
		
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
	public boolean deleteUser(int userid, String password, String ename) {
		try(
				
				Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
	  		  
				  PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteQuery"))
				
				
				
				
				
				){
			
			
			
			
			pstmt.setInt(1, user.getUserid());
			pstmt.setString(2,user.getPassword());
			
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
	public boolean insertUser(UserBean user) {
		// TODO Auto-generated method stub
		
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
	    		  
  PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertQuery")))
		  {
				pstmt.setInt(1, user.getUserid());
				pstmt.setString(2,user.getUsername());
				pstmt.setString(3,user.getEname());
				pstmt.setString(4,user.getPassword());
				
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
