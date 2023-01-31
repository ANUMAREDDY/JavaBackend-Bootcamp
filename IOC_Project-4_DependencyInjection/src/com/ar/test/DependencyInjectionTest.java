package com.ar.test;
//ctrl+shift+o
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ar.beans.Person;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//Locating xml file
		FileSystemResource fsr = new FileSystemResource("src/com/ar/cfgs/applicationContext.xml");
		// Create IOC container
		XmlBeanFactory factory = new XmlBeanFactory(fsr);
		
		Person person=(Person)factory.getBean("per");
		System.out.println(person);
		
		Person person1=(Person)factory.getBean("per1");
		System.out.println(person1);
		
		
		
		
		
	}

}
