package com.capgemini.ppc.Bean;

public class ContractBean {
	private int contractNo ;
	private int customerId;
	private int prodId;
	private int haulierId;
	private String deliveryDate;
	private String deliveryDay;
	private int quantity;
	

	public int getContractNo() {
		return contractNo;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public void setContractNo(int contractNo) {
		this.contractNo = contractNo;
	}

	

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getHaulierId() {
		return haulierId;
	}

	public void setHaulierId(int haulierId) {
		this.haulierId = haulierId;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryDay() {
		return deliveryDay;
	}

	public void setDeliveryDay(String deliveryDay) {
		this.deliveryDay = deliveryDay;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ContractBean [contractNo=" + contractNo + ", customerId=" + customerId + ", prodId=" + prodId
				+ ", haulierId=" + haulierId + ", deliveryDate=" + deliveryDate + ", deliveryDay=" + deliveryDay
				+ ", quantity=" + quantity + "]";
	}
	
	
	

}
