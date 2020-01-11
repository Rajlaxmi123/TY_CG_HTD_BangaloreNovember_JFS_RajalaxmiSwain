package com.capgemini.retailer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailer.dao.UserDAO;
import com.capgemini.retailer.dto.UserInfo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO dao;
	@Override
	public boolean register(UserInfo user) {
		// TODO Auto-generated method stub
		return dao.register(user);
	}

	@Override
	public UserInfo login(UserInfo credential) {
		// TODO Auto-generated method stub
		return dao.login(credential);
	}

	@Override
	public boolean modify(int id, String password) {
		// TODO Auto-generated method stub
		return dao.modify(id, password);
	}

}
