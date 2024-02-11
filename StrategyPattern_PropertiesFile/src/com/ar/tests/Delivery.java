package com.ar.tests;

import com.ar.components.Amazon;
import com.ar.components.AmazonDelivery;
import com.ar.components.Fedex;
import com.ar.components.UPS;
import com.ar.factory.AmazonFactory;

public class Delivery {
	
	public static void main(String args[]) {
		
		Amazon am=AmazonFactory.getInstance();
		
		
		
		
		//invoke business method
		String result= am.shopping(new String[] {"shirt","Trouser","Watch"},new float[] {4000.0f,3000.0f,50000.f});
		
		System.out.println(result);
		
		
		
	}
}
