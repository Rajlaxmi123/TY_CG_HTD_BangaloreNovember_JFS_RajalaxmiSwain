package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		
	      EntityManager entityManager = entityManagerFactory.createEntityManager();
	  EntityTransaction transaction = entityManager.getTransaction();
	      
	      transaction.begin();
	      
	
	      String jpql = "Delete from Movie where id= :id";
	Query query = entityManager.createQuery(jpql);
	
	query.setParameter("id", 105);
	
	
	int result = query.executeUpdate();
	
	System.out.println(result);
	
	
	System.out.println(" record deleted....");
	
	transaction.commit();
	
	entityManager.close();
	}

}
