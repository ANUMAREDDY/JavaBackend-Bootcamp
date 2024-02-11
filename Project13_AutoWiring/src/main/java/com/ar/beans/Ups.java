package com.ar.beans;

public class Ups implements UsDeliveryVendor {
	
	private Integer deliveryId;
	private String deliveryName;
	public Integer getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(Integer deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDeliveryName() {
		return deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}
	
	@Override
	public String toString() {
		return "Ups [deliveryId=" + deliveryId + ", deliveryName=" + deliveryName + "]";
	}
	@Override
	public String note() {
		
		return "Delivery will be done by UPS";
	}
	

}
