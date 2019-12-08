package com.capgemini.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;

public interface UserServices {
	public List<UserBean> getAllUsers();//retrieve all the users
	public UserBean userLogin(String username , String password);//retrive all data of single user
	public boolean updateUser(int userid, String password , String ename);//returntype of this method is boolean
	public boolean deleteUser(int userid , String password , String ename);
	public boolean insertUser(UserBean user);      //(int userid , String username , String ename, String password);
	//since userbean has all these.//we can directly use object of userBean
	
	
	

}
