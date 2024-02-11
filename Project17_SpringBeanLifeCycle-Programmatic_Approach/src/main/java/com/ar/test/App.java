package com.ar.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ar.beans.VoteVerifier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/ar/cfgs/applicationContext.xml");
        
        VoteVerifier vv= ctx.getBean("voter",VoteVerifier.class);
        try {
         System.out.println(vv.voteVerification());
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        
        //close container
        ctx.close();
    }
}
