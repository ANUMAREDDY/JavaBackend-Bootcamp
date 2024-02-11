package com.ar.factory;

import com.ar.components.Amazon;
import com.ar.components.AmazonDelivery;
import com.ar.components.Courier;
import com.ar.components.Fedex;
import com.ar.components.UPS;

public class AmazonFactory {

	
	public static Amazon getInstance(String type) {
		
		Courier courier=null;
		
		if(type.equalsIgnoreCase("fedex")) {
			courier=new Fedex();
		}
		else if(type.equalsIgnoreCase("ups")) {
			courier=new UPS();
		}
		else if(type.equalsIgnoreCase("amazondelivery")) {
			courier=new AmazonDelivery();
		}
		else {
			throw new IllegalArgumentException("Type is not matching");
		}
		
		//Target class
		Amazon amz= new Amazon();
		amz.setCourier(courier);
		
		return amz;
	}
}
