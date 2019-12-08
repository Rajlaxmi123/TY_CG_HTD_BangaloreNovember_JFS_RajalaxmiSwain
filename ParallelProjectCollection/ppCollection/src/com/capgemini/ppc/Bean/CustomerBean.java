package com.capgemini.ppc.Bean;

public class CustomerBean {
	private int custId;
	private String custName;
	private String streetAdress1;
	private String streetAdress2;
	private String town;
	private int postalCode;
	private String email;
	private long phoneNo;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getStreetAdress1() {
		return streetAdress1;
	}
	public void setStreetAdress1(String streetAdress1) {
		this.streetAdress1 = streetAdress1;
	}
	public String getStreetAdress2() {
		return streetAdress2;
	}
	public void setStreetAdress2(String streetAdress2) {
		this.streetAdress2 = streetAdress2;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	@Override
	public String toString() {
		return "CustomerBean [custId=" + custId + ", custName=" + custName + ", streetAdress1=" + streetAdress1
				+ ", streetAdress2=" + streetAdress2 + ", town=" + town + ", postalCode=" + postalCode + ", email="
				+ email + ", phoneNo=" + phoneNo + "]";
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


}
