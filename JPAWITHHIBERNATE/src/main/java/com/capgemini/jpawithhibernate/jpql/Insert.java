package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

public class Insert {

	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		 entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();		
		transaction.begin();		
		String sql = "insert into Movie values (105,'TY','good')";		
		Query query =  entityManager.createNativeQuery(sql);
		query.executeUpdate();
		System.out.println(" inserted......");
		transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}		
		entityManager.close();

	}

}
