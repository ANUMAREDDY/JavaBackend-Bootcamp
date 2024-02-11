package com.ar.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pm")
public final class PrimeVendor implements ContractJobs {
	
	public PrimeVendor() {
		System.out.println("0-Param constructor of Prime Vendor");
	}

	@Override
	public String fetchJob() throws Exception {
		// TODO Auto-generated method stub
		return "Job from Prime Vendor";
	}

}
