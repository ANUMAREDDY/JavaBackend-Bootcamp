package com.ar.beans;

public class Printer {
	
	private static Printer print;
	//Private Constructor
	public Printer() {
		
	}
	
	public static Printer getInstance() {
		try {
			if(print==null) {
				print= new Printer();
				return print;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
