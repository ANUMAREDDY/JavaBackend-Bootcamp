package com.ar.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	
	public WishMessageGenerator() {
		System.out.println("0-param constructor");
	}
	public WishMessageGenerator(Date date) {
		System.out.println("1-param constructor");
		this.date=date;
	}
	
	public void setDate(Date date) {
		System.out.println("Setter Method");
		this.date=date;
	}
	 
	//b.method
	
	public String generateWishMessage(String user) {
		System.out.println("generateWishMessage() "+date);
		int hour=date.getHours();
		if(hour<12)
			return "GM::"+user;
		else if(hour<16)
			return "GA::"+user;
		else if(hour<20)
			return "GE::"+user;
		else
			return "GN::"+user;
	}
	

}

