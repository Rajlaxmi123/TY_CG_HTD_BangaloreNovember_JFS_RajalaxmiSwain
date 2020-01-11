package com.capgemini.retailer.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailer.dto.UserInfo;
import com.capgemini.retailer.exception.RetailerException;

@Repository
public class UserDAOImpl implements UserDAO{

	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean register(UserInfo user) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		}catch(Exception e){
			throw new RetailerException("Email already exists");
		}
	}
	@Override
	public UserInfo login(UserInfo credential) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from UserInfo where email=:email";
		TypedQuery<UserInfo> query = manager.createQuery(jpql, UserInfo.class);
		query.setParameter("email", credential.getEmail());
		try {
			UserInfo account = query.getSingleResult();
			if (account.getPassword().equals(credential.getPassword())) {
				return account;
			} else {
				System.out.println("Invalid Credentials!!!");
				return null;
			}
		} catch (Exception e) {
			throw new RetailerException("Account does not exist");
		}
	}
	@Override
	public boolean modify(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		UserInfo user = manager.find(UserInfo.class, id);
		EntityTransaction transaction = manager.getTransaction();
		if (user != null) {
			transaction.begin();
			user.setPassword(password);
			transaction.commit();
			return true;
		} else {
			return false;
		}

	}
}
