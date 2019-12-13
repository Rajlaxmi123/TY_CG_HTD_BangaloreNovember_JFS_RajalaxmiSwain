package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class UpdateDemo {

	public static void main(String[] args) {
		
		EntityManager entityManager=null;
		EntityTransaction transaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		
		entityManager = entityManagerFactory.createEntityManager();
		

		transaction = entityManager.getTransaction();
		
		transaction.begin();
		
		Movie record = entityManager.find(Movie.class, 101);//since its returning movie type,we need to store the values inside movie type reference
		//first we have to find the record by find method , then we need to update it by setting the value.
		record.setName("Dil toh pagal hai");
		
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
