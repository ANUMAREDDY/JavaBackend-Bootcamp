package com.ar.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

	@Component("voter")
	@PropertySource("com/ar/commons/input.properties")
	public class VoteVerifier {
		@Value("${voter.name}")
		private String name;
		
		@Value("${voter.age}")
		private Integer age;
		
		private Date verificationDate;
		public VoteVerifier() {
			System.out.println("Vote verifier 0-param constructor initialized");
		}
		
		
		@PostConstruct
		public void init() {
			System.out.println("Voter verification::init method()");
			verificationDate=new Date();
			//Validation
			if(name==null || age<=0) {
				throw new IllegalArgumentException("invalid inputs are given for name or age properties");
			}
			
		}
		@PreDestroy
		public void destroy(){
			System.out.println("VoterVerifier Destroy()");
			name=null;
			age=0;
			verificationDate=null;
			
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
		
	}
