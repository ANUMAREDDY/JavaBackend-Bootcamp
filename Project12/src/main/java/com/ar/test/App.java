package com.ar.test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ar.beans.Elephant;

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
    	
    	Elephant ele=ctx.getBean("ele1",Elephant.class);
    	System.out.println(ele);
    	
    }
}
