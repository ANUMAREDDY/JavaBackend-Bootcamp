package com.ar.beans;

import org.springframework.stereotype.Component;

@Component("c2c")
public  final class ContractToContract implements ContractJobs {
	

	public ContractToContract() {
		System.out.println("0-Param of C2c vendor");
	}

	@Override
	public String fetchJob() throws Exception {
		// TODO Auto-generated method stub
		return "Job from c2c";
	}

}
