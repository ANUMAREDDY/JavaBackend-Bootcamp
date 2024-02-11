package com.ar.service;

import com.ar.DAO.CustomerDAOImpl;
import com.ar.DAO.ICustomerDAO;
import com.ar.bo.CustomerBO;
import com.ar.dto.CustomerDTO;

public final class CustomerServiceImpl implements ICustomerService{
	private ICustomerDAO dao;
	public CustomerServiceImpl(ICustomerDAO dao) {
		System.out.println("Customer Service 1-Param Constructor");
		this .dao=dao;
	}

	@Override
	public String calculateSimpleIntrestAmount(CustomerDTO dto)throws Exception {
		// Business method
		Float intrestAmt=(dto.getPrincipleAmount()*dto.getTime()*dto.getRate())/100;
		//Creating BO object to pass to DAO class for inserting into database(Persistable table)
		CustomerBO bo= new CustomerBO();
		bo.setCustomerName(dto.getCustomerName());
		bo.setCustomerAddress(dto.getCustomerAddress());
		bo.setIntrest(dto.getIntrest());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setIntrestAmount(intrestAmt);
		bo.setPrincipleAmount(dto.getPrincipleAmount());
		
		//use DAO return
		int count=dao.insert(bo);
		
		return count==1?"Customer Registered Successfully, Intrest Amount::"+intrestAmt:"Customer Not Registered";
	}

}
