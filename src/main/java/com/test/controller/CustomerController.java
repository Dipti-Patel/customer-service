package com.test.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.CustomerModel;
import com.test.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping(value = "/create")
	public CustomerModel save(@RequestBody @Valid CustomerModel customerModel) {

		CustomerModel customerModel2  =  customerService.save(customerModel);
		return customerModel2;
	}
}
