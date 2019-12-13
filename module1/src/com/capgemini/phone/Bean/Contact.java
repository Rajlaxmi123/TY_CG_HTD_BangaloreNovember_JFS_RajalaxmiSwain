package com.capgemini.phone.Bean;

public class Contact {
	private String name;
	private Long phoneNo;
	private String group1;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneno(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getGroup1() {
		return group1;
	}
	public void setGroup1(String group1) {
		this.group1 = group1;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneno=" + phoneNo + ", group1=" + group1 + "]";
	}
	
	

}
