package com.ar.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ar.beans.Score;
import com.ar.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Create IOC container
    	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
    	//get target class
    	Score sc= ctx.getBean("score",Score.class);
    	
    	System.out.println(sc.result("anuma"));
    	
    	ctx.close();
    }
}
