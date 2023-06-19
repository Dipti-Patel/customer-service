package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.CustomerModel;
import com.test.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepo customerRepo;
	
	@Override
	public CustomerModel save(CustomerModel customerModel) {

		CustomerModel customerModel2 = customerRepo.save(customerModel);
		return customerModel2;
	}

}
