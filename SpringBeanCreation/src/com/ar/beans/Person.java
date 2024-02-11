package com.ar.beans;

public class Person {
	
	private Integer id;
	private String name;
	private Integer score;
	
	public Person() {
		super();
		
	}
	
	public Person(Integer id, String name, Integer score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
}