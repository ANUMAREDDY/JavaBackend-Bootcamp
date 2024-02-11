package com.ar.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricket {
	
	private String batId;

	public Cricket(String bat) {
		super();
		this.batId = bat;
		System.out.println("1-Param Constructor Cricket Bat");
	}
	
	public void batting() {
		System.out.println("Cricket:: Batting Method()");
	}
	public void bowling() {
		System.out.println("Cricket:: bowling Method()");
	}
	public void fielding() {
		System.out.println("Cricket:: fielding Method()");
		
		//creating 2nd container
		
		ClassPathXmlApplicationContext ctx2= new ClassPathXmlApplicationContext("com/ar/cfgs/applicationContext.xml");
		System.out.println("creating 2nd container");
		
		//Calling the bean
		CricketBat bat= ctx2.getBean(batId,CricketBat.class);
		
		String runs= bat.runsScored();
		System.out.println(runs);
		
		
		
	}
	

}
