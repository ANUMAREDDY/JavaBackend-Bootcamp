package com.ar.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;


@Component("bench")
@PropertySource("com/ar/commons/info.properties")
@PropertySource("com/ar/commons/info2.properties")
//@PropertySources(value= {@PropertySource("com/ar/commons/info.properties"),@PropertySource("com/ar/commons/info2.properties")})
public class BenchEmployees {
	
	@Autowired
	@Qualifier("pm")
	private ContractJobs cj;
	@Value("${employee.name}")
	private String name;
	@Value("${employee.age}")
	private Integer age;
	
	
	public String applyJob()throws Exception {
		return cj.fetchJob()+" for "+name+" "+age;
	}
}
