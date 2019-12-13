package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		EmployeeInfo emp = new EmployeeInfo();
//		
//		emp.setEid(4);
//		emp.setEmail("gfhg@gmail.com");
//		emp.setName("gfghhg");
//		emp.setPassword("34545ee");
//		
//	
//		
//		EmployeeOtherInfo other = new EmployeeOtherInfo();
//		
//		other.setAdharno(3243545);
//		other.setDob("15-09-96");
//		other.setId(4);
//		other.setAge(23);
//		other.setEmp(emp);
		
		
		
		
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		
		try {
		//pass the persistence-unit name from the persistence.xml file
EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		 entityManager =  entityManagerFactory.createEntityManager();

		 transaction = entityManager.getTransaction();
		
		transaction.begin();
		
		//entityManager.persist(other);
		
		EmployeeInfo emp =  entityManager.find(EmployeeInfo.class, 2);
		System.out.println(emp.getOther().getAge());
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
