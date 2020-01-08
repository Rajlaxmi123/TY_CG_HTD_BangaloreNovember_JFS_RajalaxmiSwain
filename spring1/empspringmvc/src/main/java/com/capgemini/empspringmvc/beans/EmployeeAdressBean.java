package com.capgemini.empspringmvc.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employeeAdress_info")
public class EmployeeAdressBean {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column(nullable = false)
	private String addType;
	@Column
	private String address1;
	@Column
	private String address2;
	
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id",referencedColumnName ="id")
	private EmployeeBean bean;
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * @return the bean
	 */
	public EmployeeBean getBean() {
		return bean;
	}
	/**
	 * @param bean the bean to set
	 */
	public void setBean(EmployeeBean bean) {
		this.bean = bean;
	}
	/**
	 * @return the addId
	 */
	
	/**
	 * @return the add_type
	 */
	/**
	 * @return the addType
	 */
	public String getAddType() {
		return addType;
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
	 * @param addType the addType to set
	 */
	public void setAddType(String addType) {
		this.addType = addType;
	}
	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	/**
	 * @param add_type the add_type to set
	 */
	
	
}
