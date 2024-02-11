package com.ar.components;

public final class Fedex implements Courier {
	
	public Fedex(){
		System.out.println("0-Param constructor of Fedex");
	}
	public String courierAdress(int courierId) {
		System.out.println("This courier will be delivered by Fedex"+courierId);
		return String.valueOf(courierId);
	}
	

}
