package com.capgemini.retailer.dao;

import com.capgemini.retailer.dto.UserInfo;

public interface UserDAO {
	public boolean register(UserInfo user);
	public UserInfo login(UserInfo credential); 
	public boolean modify(int id , String password);
}
