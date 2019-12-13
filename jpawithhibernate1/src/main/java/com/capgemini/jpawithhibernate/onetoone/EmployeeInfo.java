package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee_info")
public class EmployeeInfo {
	@Id
	@Column
private int eid;
	@Column
private String name;
	@Column
private String email;
	@Column
private String password;
	
	
	@OneToOne(cascade= CascadeType.ALL,mappedBy = "empInfo")
	private EmployeeOtherInfo other;
	
	
	
	
	
	
	
	
	
	
/**
	 * @return the other
	 */
	public EmployeeOtherInfo getOther() {
		return other;
	}
	/**
	 * @param other the other to set
	 */
	public void setOther(EmployeeOtherInfo other) {
		this.other = other;
	}
/**
 * @return the eid
 */
public int getEid() {
	return eid;
}
/**
 * @param eid the eid to set
 */
public void setEid(int eid) {
	this.eid = eid;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
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
