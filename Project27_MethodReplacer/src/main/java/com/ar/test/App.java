package com.ar.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ar.beans.Bank;


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
    
    	
    	//Calling target class object
    	
    	Bank bank= ctx.getBean("bank",Bank.class);
    	//Invoked method
    	System.out.println("IntrestAmount::"+bank.calculateIntrestAmount(1000000,2,12));
    	
    	//close the container
    	ctx.close();
    }
}
