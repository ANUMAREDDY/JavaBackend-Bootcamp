package com.ar.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.ar.components.Amazon;
import com.ar.components.AmazonDelivery;
import com.ar.components.Courier;
import com.ar.components.Fedex;
import com.ar.components.UPS;

public class AmazonFactory {
	private static Properties props;
	static {
		try {
		//Locate properties file
		InputStream is =new FileInputStream("src/com/ar/commons/inputs.properties");
		if (is == null) {
            throw new FileNotFoundException("Properties file not found");
        }

		//Load properties file content into java.util.properties class obj
		props=new Properties();
		props.load(is);
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	//static factory method having factory pattern logic
	public static Amazon getInstance() {
		
		try {
			//get Dependent class name(courier name) from propeerties file(java.util.properties class obj)
			String courierClassName=props.getProperty("courier.type");
			//Load and create dependency class obj
			Class c= Class.forName(courierClassName);
			//Courier courier=(Courier)c.newInstance();//Deprecated from Java 9
			Constructor cons[]=c.getDeclaredConstructors();
			Courier courier=(Courier)cons[0].newInstance();
		//Target class
		Amazon amz= new Amazon();
		//assigning dependent to target
		amz.setCourier(courier);
		
		return amz;
		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
			return null;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
