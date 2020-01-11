package com.capgemini.retailer.dao;

import com.capgemini.retailer.dto.OrderInfo;

public interface OrderDAO {
public OrderInfo search(int id);
public boolean addOrder(OrderInfo order);
}
