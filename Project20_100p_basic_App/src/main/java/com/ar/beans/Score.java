package com.ar.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("score")
public class Score {
	@Autowired
	private LocalDateTime date;
	
	//b.method
	public String result(String user) {
		
		int timeScore=date.getHour();
		if(timeScore<10) {
			return user+"Your are failed";
		}
		
		return user+"You are passed      ";
		
	}

}
