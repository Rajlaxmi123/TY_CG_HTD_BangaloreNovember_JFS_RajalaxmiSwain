package com.capgemini.mywebapp.dao;

import java.util.List;

import com.capgemini.mywebapp.beans.EmployeeInfoBeans;

public interface EmployeeDAO {
	public EmployeeInfoBeans  authenticate(int empId,String password);
	public boolean addEmployee(EmployeeInfoBeans employeeInfoBeans);
	public boolean deleteEmployee(int empId);
	public boolean updateEmployee(EmployeeInfoBeans employeeInfoBeans);
	public List<EmployeeInfoBeans> getAllEmployees();
	
	public EmployeeInfoBeans searchEmployee(int empId);

}
