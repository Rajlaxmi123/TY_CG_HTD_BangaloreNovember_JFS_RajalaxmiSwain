package com.capgemini.mywebapp.services;

import java.util.List;

import com.capgemini.mywebapp.beans.EmployeeInfoBeans;

public interface EmployeeServices {
	public EmployeeInfoBeans searchEmployee(int empId);
	public EmployeeInfoBeans  authenticate(int empId,String password);
	public boolean addEmployee(EmployeeInfoBeans employeeInfoBeans);
	public boolean deleteEmployee(int empId);
	public boolean updateEmployee(EmployeeInfoBeans employeeInfoBeans);
	public List<EmployeeInfoBeans> getAllEmployees();
}
