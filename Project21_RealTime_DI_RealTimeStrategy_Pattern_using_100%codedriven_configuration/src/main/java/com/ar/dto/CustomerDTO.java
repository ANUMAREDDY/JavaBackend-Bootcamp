package com.ar.dto;
// Customer Data Transfer object: This bean class helps to carry shippable data from one layer to other layer within in the project or across the projects.
public class CustomerDTO {
	
	//Bean properties
	private String customerName;
	private String customerAddress;
	private Float principleAmount;
	private Float Rate;
	private Float time;
	private Float intrest;
	
	//Getters and Setters
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public Float getPrincipleAmount() {
		return principleAmount;
	}
	public void setPrincipleAmount(Float principleAmount) {
		this.principleAmount = principleAmount;
	}
	public Float getRate() {
		return Rate;
	}
	public void setRate(Float rate) {
		Rate = rate;
	}
	public Float getTime() {
		return time;
	}
	public void setTime(Float time) {
		this.time = time;
	}
	public Float getIntrest() {
		return intrest;
	}
	public void setIntrest(Float intrest) {
		this.intrest = intrest;
	}
	//toString method
	@Override
	public String toString() {
		return "CustomerDTO [customerName=" + customerName + ", customerAddress=" + customerAddress
				+ ", principleAmount=" + principleAmount + ", Rate=" + Rate + ", time=" + time + ", intrest=" + intrest
				+ "]";
	}
	
	
	
	

}
