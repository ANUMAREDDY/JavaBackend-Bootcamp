package com.ar.test;

import com.ar.comp.Employee;
import com.ar.comp.Food;


public class SoftwareClient {
	public static void main(String[] args) {
		
		Food food =new Food();
		Employee emp= new Employee(food);
		
		emp.work();
	}

}
