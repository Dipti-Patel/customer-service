package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.CustomerModel;

public interface CustomerRepo extends JpaRepository<CustomerModel, Long>{

}
