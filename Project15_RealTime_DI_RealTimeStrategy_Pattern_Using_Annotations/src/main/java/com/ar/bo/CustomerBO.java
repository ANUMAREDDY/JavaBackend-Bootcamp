package com.ar.bo;
//Customer Business Object: This bean class holds persistable(Which goes into database table) or persistence data(which we get from the database table).
public class CustomerBO {
	//Bean Properties
	private Integer customerId;
	//We use wrapper data types instead of data types, because data types contains '0' which has something value but Wrapper data type contains 'Null' which is nothing. So, Industry uses wrapper datatypes instead of general data types.
	private String customerName;
	private String customerAddress;
	private Float principleAmount;
	private Float Rate;
	private Float time;
	private Float intrest;
	private Float intrestAmount;
//Getters and Setters
	
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
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
	public Float getIntrestAmount() {
		return intrestAmount;
	}
	public void setIntrestAmount(Float intrestAmount) {
		this.intrestAmount = intrestAmount;
	}
	//toString method
	@Override
	public String toString() {
		return "CustomerBO [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", principleAmount=" + principleAmount + ", Rate=" + Rate + ", time=" + time
				+ ", intrest=" + intrest + ", intrestAmount=" + intrestAmount + "]";
	}
	
	
}
