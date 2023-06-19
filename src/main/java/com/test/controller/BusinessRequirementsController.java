package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.BusinessRequirementsModel;
import com.test.model.CustomerModel;
import com.test.service.BusinessRequirementsService;
import com.test.service.CustomerService;

@RestController
public class BusinessRequirementsController {

	@Autowired
	BusinessRequirementsService businessRequirementsService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String save(@RequestBody BusinessRequirementsModel businessRequirementsModel) {

		businessRequirementsService.save(businessRequirementsModel);
		return "save requirement type";
	}
}
