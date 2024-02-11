package com.ar.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ar.beans")//alternate to <context:componenet-scan/>
public class AppConfig {
	
	@Bean(name="idt")
	public LocalDateTime createLocalDateTime() {
		System.out.println("AppConfig.createLocalDateTime()");
		LocalDateTime idt=LocalDateTime.now();//gves system date and time
		return idt;
	}

}
