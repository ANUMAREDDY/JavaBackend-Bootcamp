package com.ar.comp;

public class Employee extends Person {
	private String Designation;
	private float salary;
	
	private Food food;
	
	public Employee(Food food) {
		System.out.println("Employee:: 1-param constructor");
		this.food=food;
	}
	public void work() {
		System.out.println("Employee working in a software devlopment team needs food");
	}

}
