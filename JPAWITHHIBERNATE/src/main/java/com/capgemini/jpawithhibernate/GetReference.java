package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class GetReference {

	public static void main(String[] args) {
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		
		//Movie record = entityManager.find(Movie.class, 101);
		Movie record = entityManager.getReference(Movie.class, 101);
//		System.out.println("Id---"+record.getId());
//		System.out.println("Name---"+record.getName());
//		System.out.println("Id---"+record.getRating());
//		
		System.out.println(record.getClass());
		entityManager.close();
	}

}
