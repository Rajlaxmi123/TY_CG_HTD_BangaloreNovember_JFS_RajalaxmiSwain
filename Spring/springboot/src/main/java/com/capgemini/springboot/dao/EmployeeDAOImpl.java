package com.capgemini.springboot.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.capgemini.springboot.dto.EmployeeBean;
import com.capgemini.springboot.dto.EmployeeException;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public EmployeeBean auth(String email, String password) {
		
		EntityManager manager =  factory.createEntityManager();
		String jpql = "from EmployeeBean where email=:email";// and password=:password";
		TypedQuery<EmployeeBean> query = manager.createQuery(jpql,EmployeeBean.class);
		query.setParameter("email", email);
		//query.setParameter("password",password);
		try {
		EmployeeBean bean = query.getSingleResult();  //getsingleresult will give classcast exception ..
		//so we have to use try catch block
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		if(encoder.matches(password, bean.getPassword())){
		return bean;
		}else{
			throw new EmployeeException("Password invalid");
		}
		}catch(Exception e){
		throw new EmployeeException("Email invalid");
		}
	}

	@Override
	public boolean register(EmployeeBean bean) {
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	try {
	transaction.begin();
	manager.persist(bean);
	transaction.commit();
	return true;
	}catch(Exception e)
	{
		e.printStackTrace();
		throw new EmployeeException("Email already exists");
	}
	}

//	@Override
//	public EmployeeBean getEmployee(String email) {
//		String jpql="from EmployeeBean where email=:email";
//		EntityManager manager =  factory.createEntityManager();
//		TypedQuery<EmployeeBean> query = manager.createQuery(jpql,EmployeeBean.class);
//		query.setParameter("email", email);
//		
//		try {
//			return query.getSingleResult(); 
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//			return null;
//		}
//		
//		
//		
//	}

//	@Override
//	public List<EmployeeBean> getEmployees(String name) {
//		String jpql="from EmployeeBean where name=:name";
//		EntityManager manager =  factory.createEntityManager();
//		TypedQuery<EmployeeBean> query = manager.createQuery(jpql,EmployeeBean.class);
//		query.setParameter("name", name);
//		
//
//			return query.getResultList(); 
//		
//	}
	@Override
	public List<EmployeeBean> getEmployees(String key) {
		String jpql="from EmployeeBean where name=:name or email=:email";
		EntityManager manager =  factory.createEntityManager();
		TypedQuery<EmployeeBean> query = manager.createQuery(jpql,EmployeeBean.class);
		query.setParameter("name", key);
		query.setParameter("email", key);

			return query.getResultList(); 
		
	}


	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager =  factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manager =  factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		if(bean!=null)
		{
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		
		throw new EmployeeException("Employee not found");
	}

}
