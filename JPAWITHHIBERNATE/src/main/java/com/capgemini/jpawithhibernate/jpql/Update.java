package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		
		      EntityManager entityManager = entityManagerFactory.createEntityManager();
		  EntityTransaction transaction = entityManager.getTransaction();
		      
		      transaction.begin();
		      
		String jpql = " Update Movie set name='fghhhh' where id='102'";
		      
		Query query = entityManager.createQuery(jpql);
		
		
		
		 query.executeUpdate();
		
		
		
		
		System.out.println(" record updated....");
		
		transaction.commit();
		
		entityManager.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
