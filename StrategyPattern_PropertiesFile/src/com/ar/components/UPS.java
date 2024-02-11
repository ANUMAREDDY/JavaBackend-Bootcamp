package com.ar.components;

public final class UPS implements Courier {
	
	public UPS(){
		System.out.println("0-Param constructor of UPS");
	}
	public String courierAdress(int courierId) {
		System.out.println("This courier will be delivered by UPS"+courierId);
		return String.valueOf(courierId);
	}

}
