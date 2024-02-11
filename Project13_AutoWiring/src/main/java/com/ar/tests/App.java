package com.ar.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ar.beans.FlipKart;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	//Create IOC Container
    	ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/ar/cfgs/applicationContext.xml");
    	
    	FlipKart ele=ctx.getBean("fk",FlipKart.class);
    	System.out.println(ele);
    	System.out.println(ele.note());
    }
}
