package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;
import com.capgemini.jpawithhibernate.dto.Product;

public class InsertDemo { 

	public static void main(String[] args) {
//		Movie movie = new Movie();
//		movie.setId(105);
//		movie.setName("gjhjh");
//		movie.setRating("good");
		Product product = new Product();
		product.setPid(1);
		product.setName("dsgdfgf");
		
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		
		try {
		//pass the persistence-unit name from the persistence.xml file
EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		 entityManager =  entityManagerFactory.createEntityManager();

		 transaction = entityManager.getTransaction();
		
		transaction.begin();
		//entityManager.persist(movie);
		entityManager.persist(product);
		System.out.println("Record Saved");
		transaction.commit();
		}catch(Exception e)
		{
			e.printStackTrace();
			transaction.rollback();
		}
		transaction.commit();
		entityManager.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
