package com.ar.controller;

import com.ar.dto.CustomerDTO;
import com.ar.service.ICustomerService;
import com.ar.vo.CustomerVO;

public class MainController {
	
	private ICustomerService service;
	
	
	public MainController(ICustomerService service) {
		System.out.println("Main Controller, 1-Param Injection");
		this.service=service;
	}
	
	public String processCustomer(CustomerVO vo)throws Exception {
		// Convert VO obj to DTO
		CustomerDTO dto= new CustomerDTO();
		dto.setCustomerName(vo.getCustomerName());
		dto.setCustomerAddress(vo.getCustomerAddress());
		dto.setIntrest(Float.parseFloat(vo.getIntrest()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		dto.setPrincipleAmount(Float.parseFloat(vo.getPrincipleAmount()));
		//call service class method
		String result= service.calculateSimpleIntrestAmount(dto);
		
		return result;
		
	}

}
