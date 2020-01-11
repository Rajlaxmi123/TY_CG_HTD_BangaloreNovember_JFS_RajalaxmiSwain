package com.capgemini.retailer.service;

import com.capgemini.retailer.dto.OrderInfo;


public interface OrderService {
public OrderInfo search(int id);
public boolean addOrder(OrderInfo order);
}
