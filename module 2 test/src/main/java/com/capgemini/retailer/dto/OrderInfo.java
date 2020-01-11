package com.capgemini.retailer.dto;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="OrderInfo")
public class OrderInfo {
	@Id
	@GeneratedValue
	@Column
	private int id;
	
	@Column
	private int user_id;
	@Column
	private int prod_id;
	
//	@JsonIgnore 
//	@OneToMany(cascade=CascadeType.ALL, mappedBy ="user")
//	@JoinColumn(name="user_id",referencedColumnName ="id")
//	private UserInfo user;
//	
//	@JsonIgnore 
//	@OneToMany(cascade=CascadeType.ALL, mappedBy ="productInfo")
//	@JoinColumn(name="prod_id",referencedColumnName ="id")
//	private ProductInfo productInfo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	@Override
	public String toString() {
		return "OrderInfo [id=" + id + ", user_id=" + user_id + ", prod_id=" + prod_id + ", getId()=" + getId()
				+ ", getUser_id()=" + getUser_id() + ", getProd_id()=" + getProd_id() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

//	public UserInfo getUser() {
//		return user;
//	}
//
//	public void setUser(UserInfo user) {
//		this.user = user;
//	}
//
//	public ProductInfo getProductInfo() {
//		return productInfo;
//	}
//
//	public void setProductInfo(ProductInfo productInfo) {
//		this.productInfo = productInfo;
//	}

	
	
	
	
}
