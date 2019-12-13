package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee_otherinfo")
public class EmployeeOtherInfo {
	@Id
@Column	
	private int id;
	@Column
	private int age;
	@Column
	private String dob;
	@Column
	private int adharno;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private EmployeeInfo empInfo;
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * @return the emp
	 */
	public EmployeeInfo getEmp() {
		return empInfo;
	}
	/**
	 * @param emp the emp to set
	 */
	public void setEmp(EmployeeInfo emp) {
		this.empInfo = emp;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	/**
	 * @return the adharno
	 */
	public int getAdharno() {
		return adharno;
	}
	/**
	 * @param adharno the adharno to set
	 */
	public void setAdharno(int adharno) {
		this.adharno = adharno;
	}
	

}
