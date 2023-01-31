package com.ar.comp;

public class Student extends Person {

	private int rollno;
	private String course;
	
	private Food food;
	
	public Student(Food food) {
		System.out.println("Student:: 1-param constructor");
		this.food=food;
	}
	
	@Override
	public void work() {
		System.out.println("Employee working in a software devlopment team needs food");
		
	}
	
	

}
