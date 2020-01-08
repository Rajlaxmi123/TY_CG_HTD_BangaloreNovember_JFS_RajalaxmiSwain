package com.capgemini.mywebapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.mywebapp.beans.EmployeeInfoBeans;

public class EmployeeDAOImpl implements EmployeeDAO{
private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("employeePersistenceUnit");
	@Override
	public EmployeeInfoBeans searchEmployee(int empId) {
		EntityManager manager= entityManagerFactory.createEntityManager();
		EmployeeInfoBeans employeeInfoBeans = manager.find(EmployeeInfoBeans.class, empId);
		return employeeInfoBeans;
	}
	@Override
	public EmployeeInfoBeans authenticate(int empId, String password) {
		EntityManager manager= entityManagerFactory.createEntityManager();
		String jpql = "from EmployeeInfoBeans where empId= :emp_id and password= :password";
		Query query = manager.createQuery(jpql);
		query.setParameter("emp_id", empId);
		query.setParameter("password", password);
		
		EmployeeInfoBeans employeeInfoBeans = null;
		try {
		
		 employeeInfoBeans = (EmployeeInfoBeans) query.getSingleResult();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		manager.close();
		return employeeInfoBeans;
	}
	@Override
	public boolean addEmployee(EmployeeInfoBeans employeeInfoBeans) {
		boolean isAdded = false;
		EntityManager manager =  entityManagerFactory.createEntityManager();

		EntityTransaction transaction = null;
		try {
			transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(employeeInfoBeans);
			transaction.commit();
			isAdded = true;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		manager.close();
		
		return isAdded;
		
	}
	
	
	
	
	
	@Override
	public boolean deleteEmployee(int empId) {
		boolean isDeleted = false;
		
		EntityManager manager =  entityManagerFactory.createEntityManager();
		EmployeeInfoBeans employeeInfoBeans = manager.find(EmployeeInfoBeans.class, empId);
		EntityTransaction transaction = null;
		if(employeeInfoBeans != null)
		{
			transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(employeeInfoBeans);
			transaction.commit();
			isDeleted = true;
		}
		manager.close();
		return isDeleted;

		

	}
	
	
	
	
	@Override
	public boolean updateEmployee(EmployeeInfoBeans employeeInfoBeans) {
	boolean isUpdated = false;
	EntityManager manager =  entityManagerFactory.createEntityManager();
	EmployeeInfoBeans existingemployeeInfo = manager.find(EmployeeInfoBeans.class, employeeInfoBeans);
	EntityTransaction transaction = manager.getTransaction();
	if(existingemployeeInfo !=null)
	{
		try {
			transaction.begin();
			String newname =employeeInfoBeans.getEmpName().trim();
			if(newname != null &&!newname.isEmpty())
			{
				existingemployeeInfo.setEmpName(newname);
			}
			int newAge = employeeInfoBeans.getAge();
			if(newAge >18)
			{
				existingemployeeInfo.setAge(newAge);
			}
			
			double newSalary = employeeInfoBeans.getSalary();
			if(newSalary >0)
			{
				existingemployeeInfo.setSalary(newSalary);
			}
			
			String newDesignation = employeeInfoBeans.getDesignation();
			if(newDesignation != null && !newDesignation.isEmpty())
			{
				existingemployeeInfo.setDesignation(newDesignation);
			}
			
			String newPassword = employeeInfoBeans.getPassword();
			if(newPassword != null && !newPassword.isEmpty())
			{
				existingemployeeInfo.setPassword(newPassword);
			}
			transaction.commit();
			isUpdated = true;
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	manager.close();
		return isUpdated;
	}
	
	
	
	
	@Override
	public List<EmployeeInfoBeans> getAllEmployees() {
		EntityManager manager =  entityManagerFactory.createEntityManager();
		String jpql = "from EmployeeInfoBeans";
		Query query = manager.createQuery(jpql);
		List<EmployeeInfoBeans> employeelist = query.getResultList();
		manager.close();
		return employeelist;
		
	}
	

}
