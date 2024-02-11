package com.ar.tests;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ar.config.AppConfig;
import com.ar.controller.MainController;
import com.ar.vo.CustomerVO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc= new Scanner(System.in);
       //Reading inputs
    	System.out.println("Enter Your name:");
    	String name= sc.next();
    	System.out.println("Enter Your address:");
    	String addrs= sc.next();
    	System.out.println("Enter Your Principle Amount:");
    	String pAmt= sc.next();
    	System.out.println("Enter Your Intrest:");
    	String intr= sc.next();
    	System.out.println("Enter Your Rate:");
    	String rate= sc.next();
    	System.out.println("Enter Your Time:");
    	String time= sc.next();
    	
    	//Setting data into VO class
    	CustomerVO vo=new CustomerVO();
    	vo.setCustomerName(name);
    	vo.setCustomerAddress(addrs);
    	vo.setPrincipleAmount(pAmt);
    	vo.setIntrest(intr);
    	vo.setRate(rate);
    	vo.setTime(time);
    	
    	/*// Create IOC container
    	DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/ar/cfgs/applicationContext.xml");*/
    	
    	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
    	//get Controller class obj
    	
    	MainController controller= ctx.getBean("controller",MainController.class);
    	
    	//Invoke method
    	try {
    		String result=controller.processCustomer(vo);
    		System.out.println(result);
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		System.out.println("Internal Problem Occured- Please try again Later");
    	}
    	
    	ctx.close();
    	
    }
}
