package com.nr.tests;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nr.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// locating file required for bean factory
		FileSystemResource res= new FileSystemResource("src/com/nr/cfgs/applicationContext.xml");
		// Creating a bean factory
		XmlBeanFactory factory = new XmlBeanFactory(res);
		// 
		Object obj =factory.getBean("tc");
		
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		String result= generator.generateWishMessage("Anuma");
		
		System.out.println("Result::"+result);
		
		
		
		

	}

}
