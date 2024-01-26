package com.ar.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ar.beans.A;

public class Circularinjection {

	public static void main(String[] args) {
		FileSystemResource res = new FileSystemResource("src/com/ar/cfgs/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		A a1= (A)factory.getBean("a");
		
		System.out.println(a1);

	}

}
