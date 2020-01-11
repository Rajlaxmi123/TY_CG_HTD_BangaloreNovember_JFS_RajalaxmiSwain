package com.capgemini.retailer.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="UserInfo")
public class UserInfo {
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
	private String name;
	@Column(unique=true,nullable=false)
	private String email;
	@Column
	private String password;
	

	
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

//	public List<ProductInfo> getProductInfo() {
//		return productInfo;
//	}
//
//	public void setProductInfo(List<ProductInfo> productInfo) {
//		this.productInfo = productInfo;
//	}
//
//	public List<OrderInfo> getOrderInfo() {
//		return orderInfo;
//	}
//
//	public void setOrderInfo(List<OrderInfo> orderInfo) {
//		this.orderInfo = orderInfo;
//	}

//	@JsonIgnore 
//	@ManyToOne(cascade = CascadeType.ALL)
//	private List<ProductInfo> productInfo;
//	
//	@JsonIgnore 
//	@ManyToOne(cascade = CascadeType.ALL )
//	private List<OrderInfo> orderInfo;
//
//	@Override
//	public String toString() {
//		return "UserInfo [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
//				+ ", productInfo=" + productInfo + ", orderInfo=" + orderInfo + "]";
//	}

}
