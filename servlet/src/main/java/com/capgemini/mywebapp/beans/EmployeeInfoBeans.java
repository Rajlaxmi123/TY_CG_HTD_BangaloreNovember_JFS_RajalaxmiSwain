package com.capgemini.mywebapp.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_info")
public class EmployeeInfoBeans {
	@Id
	@Column(name="emp_id")
private int empId;
	@Column(name="emp_name")
private String empName;
	@Column
private double salary;
	@Column
private int age;
	@Column
private String designation;
	@Column
private String password;
/**
 * @return the empId
 */
public int getEmpId() {
	return empId;
}
/**
 * @param empId the empId to set
 */
public void setEmpId(int empId) {
	this.empId = empId;
}
/**
 * @return the empName
 */
public String getEmpName() {
	return empName;
}
/**
 * @param empName the empName to set
 */
public void setEmpName(String empName) {
	this.empName = empName;
}
/**
 * @return the salary
 */
public double getSalary() {
	return salary;
}
/**
 * @param salary the salary to set
 */
public void setSalary(double salary) {
	this.salary = salary;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}
/**
 * @return the designation
 */
public String getDesignation() {
	return designation;
}
/**
 * @param designation the designation to set
 */
public void setDesignation(String designation) {
	this.designation = designation;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}

}
