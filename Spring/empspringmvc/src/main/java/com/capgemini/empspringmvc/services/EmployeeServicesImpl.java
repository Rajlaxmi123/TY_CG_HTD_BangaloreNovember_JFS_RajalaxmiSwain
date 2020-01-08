package com.capgemini.empspringmvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgemini.empspringmvc.beans.EmployeeAdressBean;
import com.capgemini.empspringmvc.beans.EmployeeBean;
import com.capgemini.empspringmvc.dao.EmployeeDAO;



@Service
public class EmployeeServicesImpl implements EmployeeService{
	@Autowired
	private EmployeeDAO dao;
	
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	
	
	
	@Override
	public EmployeeBean auth(String email, String password) {
		
		return dao.auth(email, password);
	}

	@Override
	public boolean register(EmployeeBean bean) {
		
		String encodedPassword = encoder.encode(bean.getPassword());
		bean.setPassword(encodedPassword);
		List<EmployeeAdressBean> adressBeans = bean.getAddressBeans();
		for(EmployeeAdressBean employeeAdressBean : adressBeans)
		{
		employeeAdressBean.setBean(bean);
		}
		return dao.register(bean);
	}

	@Override
	public List<EmployeeBean> getEmployees(String key) {
		// TODO Auto-generated method stub
		return dao.getEmployees(key);
	}

	@Override
	public boolean changePassword(int id, String password) {
		// TODO Auto-generated method stub
		return dao.changePassword(id,encoder.encode(password) );
	}

	

}
