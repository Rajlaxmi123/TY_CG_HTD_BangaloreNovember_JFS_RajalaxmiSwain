package com.capgemini.retailer.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.retailer.dto.OrderInfo;
import com.capgemini.retailer.dto.ProductInfo;

@Repository
public class OrderDAOImpl implements OrderDAO{
	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public OrderInfo search(int id) {
	
		EntityManager manager = factory.createEntityManager();
		OrderInfo order = manager.find(OrderInfo.class, id);
		return order;
	}

	@Override
	public boolean addOrder(OrderInfo order) {
		
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			try {
				transaction.begin();
				manager.persist(order);
				transaction.commit();
				return true;
			} catch (Exception e) {
				return false;
			}
		}

}
