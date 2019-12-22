package com.capgemini.flipkart1.dao;

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

import com.capgemini.flipkart1.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO{



	FileReader reader ;
	Scanner sc = new Scanner(System.in);
	Connection  conn ;
	Properties prop ;



	public ProductDAOImpl(){

		try {
			reader= new FileReader("db4.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
		
			e.printStackTrace();
		}





	}


	@Override
	public List<ProductBean> getAllProducts() {
		List<ProductBean> list = new ArrayList<ProductBean>();


		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query1"))


				){
			while(rs.next())
			{
				ProductBean	product =  new ProductBean();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setCost(rs.getDouble(4));
				product.setColor(rs.getString(3));
				product.setDescription(rs.getString(5));
				product.setNo(rs.getInt(6));

				list.add(product);

			}
			return list;

		}catch(Exception e)
		{
			e.printStackTrace();

		}
return null;
	}








	@Override
	public List<ProductBean> search(String name) {
		List<ProductBean> list1 = new ArrayList<ProductBean>();
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
		
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("searchQuery"))
				


				){
			
			pstmt.setString(1, name);
			
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				ProductBean	product1 =  new ProductBean();
				product1.setId(rs.getInt(1));
				product1.setName(rs.getString(2));
				product1.setCost(rs.getDouble(4));
				product1.setColor(rs.getString(3));
				product1.setDescription(rs.getString(5));
				product1.setNo(rs.getInt(6));

				list1.add(product1);

			}
			return list1;

		}catch(Exception e)
		{
			e.printStackTrace();

		}
		
		
		
		
		
		return null;
	}


	@Override
	public boolean insert(ProductBean product) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
	    		  
				  PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertQuery")))
						  {
								
								pstmt.setString(1,product.getName());
							pstmt.setString(2, product.getColor());
							pstmt.setDouble(3, product.getCost());
							pstmt.setString(4, product.getDescription());
							pstmt.setInt(5, product.getNo());
								
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
