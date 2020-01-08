package com.capgemini.mywebapp.services;

import java.util.List;

import com.capgemini.mywebapp.beans.EmployeeInfoBeans;
import com.capgemini.mywebapp.dao.EmployeeDAO;
import com.capgemini.mywebapp.dao.EmployeeDAOImpl;

public class EmployeeServicesImpl implements EmployeeServices{

	private EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	public EmployeeInfoBeans searchEmployee(int empId) {
		
		return dao.searchEmployee( empId);
	}
	@Override
	public EmployeeInfoBeans authenticate(int empId, String password) {
		
		return dao.authenticate(empId, password);
	}
	@Override
	public boolean addEmployee(EmployeeInfoBeans employeeInfoBeans) {
		// TODO Auto-generated method stub
		return dao.addEmployee(employeeInfoBeans);
	}
	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(empId);
	}
	@Override
	public boolean updateEmployee(EmployeeInfoBeans employeeInfoBeans) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(employeeInfoBeans);
	}
	@Override
	public List<EmployeeInfoBeans> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
