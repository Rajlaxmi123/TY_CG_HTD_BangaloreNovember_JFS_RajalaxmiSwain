package com.capgemini.springrest.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee_info")
public class EmployeeBean {
	@Id
	@Column
	@GeneratedValue                                  //autoincrement
private int id;

	@Column
private String name;
	@Column(unique = true,nullable = false)
private String email;
	@Column
private String password;
	
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy ="bean")
	private List<EmployeeAdressBean> addressBeans;
	
	
/**
	 * @return the addressBeans
	 */
	public List<EmployeeAdressBean> getAddressBeans() {
		return addressBeans;
	}
	/**
	 * @param addressBeans the addressBeans to set
	 */
	public void setAddressBeans(List<EmployeeAdressBean> addressBeans) {
		this.addressBeans = addressBeans;
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "EmployeeBean [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
}
 

}
