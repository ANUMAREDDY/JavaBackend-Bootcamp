package com.ar.tests;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ar.components.Amazon;
import com.ar.components.AmazonDelivery;
import com.ar.components.Fedex;
import com.ar.components.UPS;

public class Delivery {
	
	public static void main(String args[]) {
		
		DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ar/cfgs/applicationContext.xml");
		
		//Target class obj creation
		Amazon amazon=factory.getBean("amazon",Amazon.class);
		
		//invoke business method
		String result= amazon.shopping(new String[] {"shirt","Trouser","Watch"},new float[] {4000.0f,3000.0f,50000.f});
		
		System.out.println(result);
		
		
		
	}
}
