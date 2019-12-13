package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Retrieve {

	public static void main(String[] args) {
		
		
		EntityManager entityManager = null;
		
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		
		entityManager = entityManagerFactory.createEntityManager();
		
		
		
		//String jpql = "from Movie";
		String jpql = "Select name from Movie";//entityclassname
		Query query = entityManager.createQuery(jpql);
		//List<Movie> record = query.getResultList();
		List<String> record = query.getResultList();//generic type will be string coz its returning name only
		
//for (Movie movie : record) {
	//System.out.println("movie id" +movie.getId());
	//System.out.println("movie name" +movie.getName());
	//System.out.println("movie rating" +movie.getRating());
	

//}
		
		for (String movie : record) {
			System.out.println(movie);
		}
entityManager.close();
	
}		
		
		
		
		
		
		
		
		
		
		
		
		
	}


