package com.capgemini.jpawithhibernate.manyToMany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

public class TestManyToMany {

	public static void main(String[] args) {
		
		EmployeeInfo emp1 = new EmployeeInfo();
		emp1.setEid(45);
		emp1.setEmail("ram@gmail.com");
		emp1.setName("Ram");
		emp1.setPassword("35645");
		
		EmployeeInfo emp2 = new EmployeeInfo();
		emp2.setEid(46);
		emp2.setEmail("raghav@gmail.com");
		emp2.setName("Raghav");
		emp2.setPassword("35645");
		
		ArrayList<EmployeeInfo> aInfo = new ArrayList<EmployeeInfo>();
		aInfo.add(emp1);
		aInfo.add(emp2);
		
		TrainingInfo tInfo	= new TrainingInfo();
		tInfo.setTid(1);
		tInfo.settName("capgemini");
		tInfo.seteList(aInfo);
		
		
		
		
	
		
		
		
		
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
				
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			 entityManager =  entityManagerFactory.createEntityManager();

			 transaction = entityManager.getTransaction();
			
			transaction.begin();
			
			entityManager.persist(tInfo);
			
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
