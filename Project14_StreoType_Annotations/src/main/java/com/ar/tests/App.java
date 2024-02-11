package com.ar.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ar.beans.BenchEmployees;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/ar/cfgs/applicationContext.xml");
        
        BenchEmployees be= ctx.getBean("bench",BenchEmployees.class);
        
        System.out.println(be.applyJob());
    }
}
