package com.ar.vo;
// Value object: This Bean class holds input/output data of the application.
//This class contains all the data in the form of string values.
public class CustomerVO {
	// Bean Properties
	private String customerName;
	private String customerAddress;
	private String principleAmount;
	private String Rate;
	private String time;
	private String intrest;
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
	public String getPrincipleAmount() {
		return principleAmount;
	}
	public void setPrincipleAmount(String principleAmount) {
		this.principleAmount = principleAmount;
	}
	public String getRate() {
		return Rate;
	}
	public void setRate(String rate) {
		Rate = rate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getIntrest() {
		return intrest;
	}
	public void setIntrest(String intrest) {
		this.intrest = intrest;
	}
	//toString method
	@Override
	public String toString() {
		return "CustomerVO [customerName=" + customerName + ", customerAddress=" + customerAddress
				+ ", principleAmount=" + principleAmount + ", Rate=" + Rate + ", time=" + time + ", intrest=" + intrest
				+ "]";
	}
	
}
