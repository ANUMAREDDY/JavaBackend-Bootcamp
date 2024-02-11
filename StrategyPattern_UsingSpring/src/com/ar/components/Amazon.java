package com.ar.components;

import java.util.Arrays;
import java.util.Random;

public final class Amazon {
	
	
	
	private Courier courier;
	
	
	public Amazon() {
		System.out.println(" 0-Param Constructors");
		
	}

	public void setCourier(Courier courier) {
		System.out.println("Setter Injection to set the   Courier in Amazon");
		this.courier=courier;
	}
	
	public String shopping(String[] items, float[] prices) {
		float billAmount=0.0f;
		for(float p:prices) {
			billAmount+=p;
		}
		
		int courierId= new Random().nextInt(1000);
		
		String msg=courier.courierAdress(courierId);
		
		return Arrays.toString(items)+"with prices"+Arrays.toString(prices)+"having bill amount"+":::"+msg;		
	}

}
