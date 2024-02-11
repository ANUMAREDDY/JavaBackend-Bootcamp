package com.ar.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoteVerifier implements InitializingBean,DisposableBean {
	
	private String name;
	private Integer age;
	private Date verificationDate;
	
	public VoteVerifier(){
		System.out.println("Vote Verifier: 0-Param Constructor");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("SetName-Declarative Approach");
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		System.out.println("SetAge-Declarative Approach");
		this.age = age;
	}
	//Declarative Approach
	public void myInit() {
		System.out.println("Voter verification init custom method://Declarative Approach");
		verificationDate=new Date();
		//Validation
		if(name==null || age<=0) {
			throw new IllegalArgumentException("invalid inputs are given for name or age properties");
		}
	}
	//Declarative Approach
	public void myDestroy() {
		System.out.println("VoterVerifier.myDestroy()://Declarative Approach");
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
	
	//Programmatic Approach
	@Override
	public void destroy() throws Exception {
		System.out.println("VoterVerifier.ourDestroy()://Programmatic Approach");
		name=null;
		age=0;
		verificationDate=null;
	}
		
	

	//Programmatic Approach
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Voter verification init custom method://Programmatic Approach");
		verificationDate=new Date();
		//Validation
		if(name==null || age<=0) {
			throw new IllegalArgumentException("invalid inputs are given for name or age properties");
		}
		
	}
	//Annotation Approach
	@PostConstruct
	public void ourInit() {
		System.out.println("Voter verification::init method()://Annotation Approach");
		verificationDate=new Date();
		//Validation
		if(name==null || age<=0) {
			throw new IllegalArgumentException("invalid inputs are given for name or age properties");
		}
		
	}
	//Annotation Approach
	@PreDestroy
	public void ourDestroy(){
		System.out.println("VoterVerifier Destroy()://Annotation Approach");
		name=null;
		age=0;
		verificationDate=null;
		
	}
}
