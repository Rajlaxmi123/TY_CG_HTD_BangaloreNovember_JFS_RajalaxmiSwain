package com.capgemini.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.caps.jdbc.factory.UserFactory;

public class UserServicesImpl implements UserServices {

	UserDAO dao =  UserFactory.instanceOfUseDAOImpl();

	@Override
	public UserBean userLogin(String username, String password) {
	
		return dao.userLogin(username, password);
	}

	@Override
	public List<UserBean> getAllUsers() {

		return dao.getAllUsers();
	}

	@Override
	public boolean updateUser(int userid, String password, String ename) {
		
		return dao.updateUser( userid,  password ,  ename);
	}

	@Override
	public boolean deleteUser(int userid, String password, String ename) {
		
		return dao.deleteUser(userid, password, ename);
	}

	@Override
	public boolean insertUser(UserBean user) {
		
		
		return dao.insertUser(user);
	}

}
