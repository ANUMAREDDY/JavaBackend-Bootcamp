package com.ar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;

import com.ar.dto.CustomerDTO;
import com.ar.service.ICustomerService;
import com.ar.vo.CustomerVO;
@Controller("controller")
//@PropertySource("com/ar/commons/jdbc.properties")
//@PropertySource("com/ar/commons/info.properties")
public class MainController {
	@Autowired
	@Qualifier("customerservice")
	private ICustomerService service;
	
	public MainController() {
		System.out.println("Main Controller, 0-Param Injection");
	}
	
	/*public MainController(ICustomerService service) {
		System.out.println("Main Controller, 1-Param Injection");
		this.service=service;
	}*/
	
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
