package com.ar.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FlipKart {
	
	@Autowired(required=true)
	@Qualifier("dtdc")
	private UsDeliveryVendor vendor;
	
	@Autowired(required=true)
	public FlipKart(@Qualifier("ups") UsDeliveryVendor vendor) {
		super();
		System.out.println("Constructor of flipKart");
		this.vendor = vendor;
	}
	@Autowired(required=true)
	@Qualifier("dtdc")
	public void setVendor(UsDeliveryVendor vendor) {
		System.out.println("set of flipKart");
		this.vendor = vendor;
	}
	@Autowired(required=true)
	@Qualifier("ups")
	public void assign(UsDeliveryVendor vendor) {
		System.out.println("arbitary of flipKart");
		this.vendor = vendor;
	}
	private Integer orderId;
	private String orderName;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
	public String note() {
		System.out.println("Reached Flipkart note"+vendor);
		return vendor.note();
	}
	@Override
	public String toString() {
		return "FlipKart [orderId=" + orderId + ", orderName=" + orderName + "]";
	}

}
