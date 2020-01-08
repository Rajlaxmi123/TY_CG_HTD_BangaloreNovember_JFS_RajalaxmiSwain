package com.capgemini.empspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgemini.empspringboot.dto.EmployeeAdressBean;
import com.capgemini.empspringboot.dto.EmployeeBean;
import com.capgemini.empspringboot.exception.EmployeeException;
import com.capgemini.empspringboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
	
	@Autowired
	private EmployeeRepository repository;
	@Override
	public EmployeeBean auth(String email, String password) { //we have to check only for email,passwoerd is encrypted so checked explicitly
		EmployeeBean bean =  repository.findByEmail(email);
		if(bean!=null) {
		if(encoder.matches(password, bean.getPassword()))
		{
		return bean;
	}
		throw new EmployeeException("Pssword not matching");
		}	
		throw new EmployeeException("email doesnt exists");
	}

	@Override
	public boolean register(EmployeeBean bean) {
		bean.setPassword(encoder.encode(bean.getPassword())); //getting the password and setting the paSSWORD TO SAMR VARIABLE
		for(EmployeeAdressBean addressbean :bean.getAddressBeans())
		{
			addressbean.setBean(bean);
		}
		
		
		repository.save(bean);
		return true;
	}

	@Override
	public List<EmployeeBean> getEmployees(String key) {
		// TODO Auto-generated method stub
		return repository.findByKey(key);
	}

	@Override
	public boolean changePassword(int id, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		repository.deleteById(id);
		return true;
	}

}
