package com.ar.components;

public final class AmazonDelivery implements Courier {
	
	public AmazonDelivery(){
		System.out.println("0-Param constructor of AmazonDelivery");
	}
	public String courierAdress(int courierId) {
		System.out.println("This courier will be delivered by AmazonDelivery"+courierId);
		return String.valueOf(courierId);
	}

}
