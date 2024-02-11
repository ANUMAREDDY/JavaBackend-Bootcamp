package com.ar.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ar.beans.Printer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Printer.getInstance();1
    	
    	DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/ar/cfgs/applicationContext.xml");
    	
    	/*Printer print= factory.getBean("printer",Printer.class);
    	System.out.println(print);
    	Printer print1= factory.getBean("printer",Printer.class);
    	System.out.println(print1); =====2======
    	Using same bean ID they are behaving like singleton java class
    	but using different bean ID it is not.
    	O/P: com.ar.beans.Printer@4d95d2a2
            com.ar.beans.Printer@4d95d2a2
            ===>> This scenario is possible because whenever bean is
            created then bean is stored in metadata/Cache data
            with the appropriate bean Id. So, When it get a call from same id
            then it is representing same object from internal cache of
            IOC Container.*/
    	
    	/*Printer print= factory.getBean("printer",Printer.class);
    	System.out.println(print);
    	Printer print1= factory.getBean("printer1",Printer.class);
    	System.out.println(print1);
    	As we discussed above, it showing different bean address
    	with different bean ID
    	o/P:===============3===============
    	com.ar.beans.Printer@4d95d2a2
        com.ar.beans.Printer@53f65459*/
    	
    	Printer print= factory.getBean("printer",Printer.class);
    	System.out.println(print);
    	Printer print1= factory.getBean("printer1",Printer.class);
    	System.out.println(print1);

        
        
    }
}
