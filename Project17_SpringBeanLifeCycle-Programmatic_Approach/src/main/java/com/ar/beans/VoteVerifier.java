package com.ar.beans;
import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class VoteVerifier implements InitializingBean,DisposableBean {

 
	private String name;
	private Integer age;
	private Date verificationDate;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Set name");
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		System.out.println("Set age");
		this.age = age;
	}
	
	/*public void myInit() {
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
*/
	public String voteVerification() {
		if(age>=18) {
			return name+" "+"age is"+" "+age+" "+"eligible to vote"+" "+"at this current date:"+" "+verificationDate;
			
		}
			return name+" "+"age is"+" "+age+" "+" not eligible to vote"+" "+"at this current date:"+" "+verificationDate;
	
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("VoterVerifier Destroy()through DisposableBean(I)");
		name=null;
		age=0;
		verificationDate=null;
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Voter verification::afterPropertiesSet()(Initializing Bean(I)");
		verificationDate=new Date();
		//Validation
		if(name==null || age<=0) {
			throw new IllegalArgumentException("invalid inputs are given for name or age properties");
		}
		
	}
	
}
