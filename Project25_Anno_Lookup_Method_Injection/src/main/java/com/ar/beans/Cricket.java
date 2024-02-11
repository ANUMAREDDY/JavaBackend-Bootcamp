package com.ar.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("ckt")
public interface Cricket{
	@Lookup
	public abstract CricketBat createCricketBat();

	
	public default void batting() {
		System.out.println("Cricket:: Batting Method()");
	}
	public default void bowling() {
		System.out.println("Cricket:: bowling Method()");
	}
	public default void fielding() {
		System.out.println("Cricket:: fielding Method()");
		
		/*creating 2nd container
		
		ClassPathXmlApplicationContext ctx2= new ClassPathXmlApplicationContext("com/ar/cfgs/applicationContext.xml");
		System.out.println("creating 2nd container");*/
		
		//Calling the bean
		CricketBat bat= createCricketBat();
		
		String runs= bat.runsScored();
		System.out.println(runs);
		
		
		
	}

	
	

}
