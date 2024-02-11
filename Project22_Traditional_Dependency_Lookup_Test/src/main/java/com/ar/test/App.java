package com.ar.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    	ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/ar/cfgs/applicationContext.xml");
    	
    	System.out.println("Traditional Dependency Lookup Test:: 1st IOC container creation");
    	
    	//Calling target class object
    	
    	Cricket ct= ctx.getBean("ckt",Cricket.class);
    	
    	ct.batting();
    	ct.bowling();
    	ct.fielding();
    	
    	//close the container
    	ctx.close();
    }
}
