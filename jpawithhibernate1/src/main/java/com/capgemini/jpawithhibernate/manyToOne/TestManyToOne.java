package com.capgemini.jpawithhibernate.manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

public class TestManyToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

EmployeeInfo emp = new EmployeeInfo();
		
		emp.setEid(5);
		emp.setEmail("ghfhfg@gmail.com");
		emp.setName("vvcvcvc");
		emp.setPassword("45ee");
		
		
		EmployeeExperience exp1 = new EmployeeExperience();
		exp1.setExpId(12);
		exp1.setcName("Delloite");
		exp1.setNoOfYear(3);
		exp1.setEmp(emp);
		
		EmployeeExperience exp2 = new EmployeeExperience();
		exp2.setExpId(13);
		exp2.setcName("Citrix");
		exp2.setNoOfYear(2);
		exp2.setEmp(emp);
		
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
				
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			 entityManager =  entityManagerFactory.createEntityManager();

			 transaction = entityManager.getTransaction();
			
			transaction.begin();
			
			entityManager.persist(exp1);
			entityManager.persist(exp2);
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
