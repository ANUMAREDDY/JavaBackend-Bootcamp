package com.ar.service;

import com.ar.dto.CustomerDTO;

public interface ICustomerService {
	public String calculateSimpleIntrestAmount(CustomerDTO dto)throws Exception;
}
