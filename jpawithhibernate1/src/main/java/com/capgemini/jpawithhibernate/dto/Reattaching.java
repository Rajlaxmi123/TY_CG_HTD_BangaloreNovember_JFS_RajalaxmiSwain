package com.capgemini.jpawithhibernate.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Reattaching {

	public static void main(String[] args) {
		
		
		EntityManager entityManager=null;
		EntityTransaction transaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		
		entityManager = entityManagerFactory.createEntityManager();
		

		transaction = entityManager.getTransaction();
		
		transaction.begin();
		
		Movie record = entityManager.find(Movie.class, 102);
		System.out.println(entityManager.contains(record));
		entityManager.detach(record);
		System.out.println(entityManager.contains(record));
		Movie reattach = entityManager.merge(record);
		
		reattach.setName("hfghj8");
		
		System.out.println("record updated......");
		transaction.commit();
		}catch(Exception e)
		{
			e.printStackTrace();
			transaction.rollback();
		}
	

		
		entityManager.close();
		
		

	}

}
