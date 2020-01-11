package com.capgemini.retailer.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="ProductInfo")
public class ProductInfo {
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column(unique=true,nullable=false)
	private String name;
	@Column
	private int quantity;
	@Column
	private String details;
	
	@Column
	private double cost;
	
	@Column
	private int user_id;
	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
//	@JsonIgnore 
//	@OneToMany(cascade=CascadeType.ALL,mappedBy ="user")
//	@JoinColumn(name="user_id",referencedColumnName ="id")
//	private UserInfo user;
//	
//	@JsonIgnore 
//	@ManyToOne(cascade = CascadeType.ALL )
//	private List<OrderInfo> orderInfo;

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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

//	public UserInfo getUser() {
//		return user;
//	}
//
//	public void setUser(UserInfo user) {
//		this.user = user;
//	}
//
//	public List<OrderInfo> getOrderInfo() {
//		return orderInfo;
//	}
//
//	public void setOrderInfo(List<OrderInfo> orderInfo) {
//		this.orderInfo = orderInfo;
//	}
//
//	@Override
//	public String toString() {
//		return "ProductInfo [id=" + id + ", name=" + name + ", quantity=" + quantity + ", details=" + details
//				+ ", cost=" + cost + ", user=" + user + ", orderInfo=" + orderInfo + "]";
//	}
//	
//	
	
}
