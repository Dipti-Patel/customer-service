package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.BusinessRequirementsModel;
import com.test.repo.BusinessRequirementsRepo;

@Service
public class BusinessRequirementsServiceImpl implements BusinessRequirementsService {

	@Autowired
	BusinessRequirementsRepo businessRequirementsRepo;
	
	@Override
	public void save(BusinessRequirementsModel businessRequirementsModel) {
		
		businessRequirementsRepo.save(businessRequirementsModel);
	}

}
