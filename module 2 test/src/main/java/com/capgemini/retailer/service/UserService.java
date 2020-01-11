package com.capgemini.retailer.service;

import com.capgemini.retailer.dto.UserInfo;

public interface UserService {
public boolean register(UserInfo user);
public UserInfo login(UserInfo credential);
public boolean modify(int id , String password);

}
