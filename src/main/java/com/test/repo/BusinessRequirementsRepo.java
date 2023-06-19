package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.BusinessRequirementsModel;

public interface BusinessRequirementsRepo extends JpaRepository<BusinessRequirementsModel, Long> {

}
