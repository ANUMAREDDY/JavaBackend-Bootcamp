package com.ar.tests;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ar.beans.Person;

public class BeanCreation {
	
	public static void main(String args[]) {
		
		FileSystemResource loc= new FileSystemResource("src/com/ar/cfgs/applicationContext.xml");
		
		XmlBeanFactory factory= new XmlBeanFactory(loc);
		
		Person per1=(Person)factory.getBean("p1");
		System.out.println(per1.toString());
		
		Person per=(Person)factory.getBean("p");
		System.out.println(per.toString());
	}

}
