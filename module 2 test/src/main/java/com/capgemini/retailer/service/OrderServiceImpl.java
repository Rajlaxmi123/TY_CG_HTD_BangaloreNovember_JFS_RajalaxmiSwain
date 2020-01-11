package com.capgemini.retailer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailer.dao.OrderDAO;
import com.capgemini.retailer.dao.UserDAO;
import com.capgemini.retailer.dto.OrderInfo;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderDAO dao;
	@Override
	public OrderInfo search(int id) {
		// TODO Auto-generated method stub
		return dao.search(id);
	}
	@Override
	public boolean addOrder(OrderInfo order) {
		// TODO Auto-generated method stub
		return dao.addOrder(order);
	}

}
