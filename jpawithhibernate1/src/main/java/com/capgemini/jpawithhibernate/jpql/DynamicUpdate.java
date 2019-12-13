package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdate {

	public static void main(String[] args) {
		
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		
	      EntityManager entityManager = entityManagerFactory.createEntityManager();
	  EntityTransaction transaction = entityManager.getTransaction();
	      
	      transaction.begin();
	      
	//String jpql = " Update Movie set name='fghhhh' where id='102'";
	      String jpql = "Update Movie set name= :name where id= :id";
	Query query = entityManager.createQuery(jpql);
	
	query.setParameter("id", 105);
	query.setParameter("name", "ABCD");
	
	int result = query.executeUpdate();
	
	System.out.println(result);
	
	
	System.out.println(" record updated....");
	
	transaction.commit();
	
	entityManager.close();
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
