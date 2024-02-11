package com.ar.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricket implements ApplicationContextAware {
	
	private String batId;
	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Cricket:: Application Context container inject in target class to avoid creation of second container");
		this.ctx=applicationContext;
		
	}

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
		
		/*creating 2nd container
		
		ClassPathXmlApplicationContext ctx2= new ClassPathXmlApplicationContext("com/ar/cfgs/applicationContext.xml");
		System.out.println("creating 2nd container");*/
		
		//Calling the bean
		CricketBat bat= ctx.getBean(batId,CricketBat.class);
		
		String runs= bat.runsScored();
		System.out.println(runs);
		
		
		
	}

	
	

}
