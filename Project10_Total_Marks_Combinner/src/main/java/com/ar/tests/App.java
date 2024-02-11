package com.ar.tests;

import java.util.Scanner;
import com.ar.controller.MainController;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ar.vo.StudentVO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Read inputs
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter Student Name:");
    	String name=sc.next();
    	System.out.println("Enter Student class:");
    	String studentClass=sc.next();
    	System.out.println("Enter exam:");
    	String exam=sc.next();
    	System.out.println("Enter Telugu Marks:");
    	String telugu=sc.next();
    	System.out.println("Enter English Marks:");
    	String english=sc.next();
    	System.out.println("Enter Mathematics Marks:");
    	String mathematics=sc.next();
    	System.out.println("Enter Science Marks:");
    	String science=sc.next();
    	System.out.println("Enter Social Marks:");
    	String social=sc.next();
    	
    	StudentVO vo= new StudentVO();
    	vo.setStudentName(name);
    	vo.setStudentClass(studentClass);
    	vo.setExam(exam);
    	vo.setTelugu(telugu);
    	vo.setEnglish(english);
    	vo.setMathematics(mathematics);
    	vo.setScience(science);
    	vo.setSocial(social);
    	//Create IOC container
    	DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/ar/cfgs/applicationContext.xml");
    	//Get controller class obj
    	
    	MainController controller=factory.getBean("controller",MainController.class);
    	
    	try {
    		String result=controller.processStudent(vo);
    		System.out.println(result);
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		System.out.println("Internal Problem Occured- Please try again Later");
    	}
    	
    	
    	
    }
}
