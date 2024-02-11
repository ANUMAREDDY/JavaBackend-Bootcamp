package com.ar.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ar.appconfig.AppConfig;
import com.ar.beans.Cricket;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Creating IOC container
    	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	System.out.println("IOC container creation");
    	
    	//Calling target class object
    	
    	Cricket ct= ctx.getBean("ckt",Cricket.class);
    	
    	ct.batting();
    	ct.bowling();
    	ct.fielding();
    	
    	//close the container
    	ctx.close();
    }
}
