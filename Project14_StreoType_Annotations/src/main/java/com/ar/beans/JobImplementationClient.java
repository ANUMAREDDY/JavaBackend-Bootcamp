package com.ar.beans;

import org.springframework.stereotype.Component;

@Component("jic")
public final class JobImplementationClient implements ContractJobs {
	
	public JobImplementationClient() {
		System.out.println("0-Param constructor of implementation");
	}

	@Override
	public String fetchJob() throws Exception {
		// TODO Auto-generated method stub
		return "Job from Implementation";
	}

	

}
