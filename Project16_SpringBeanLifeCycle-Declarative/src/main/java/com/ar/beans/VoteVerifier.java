package com.ar.beans;

import java.util.Date;

public class VoteVerifier {
	
	private String name;
	private Integer age;
	private Date verificationDate;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void myInit() {
		System.out.println("Voter verification init custom method");
		verificationDate=new Date();
		//Validation
		if(name==null || age<=0) {
			throw new IllegalArgumentException("invalid inputs are given for name or age properties");
		}
	}
	public void myDestroy() {
		System.out.println("VoterVerifier.myDestroy()");
		name=null;
		age=0;
		verificationDate=null;
	}

	public String voteVerification() {
		if(age>=18) {
			return "You are age is"+" "+age+" "+"eligible to vote"+" "+"at this current date:"+" "+verificationDate;
			
		}
			return "You are age is"+" "+age+" "+" not eligible to vote"+" "+"at this current date:"+" "+verificationDate;
	
	}
}
