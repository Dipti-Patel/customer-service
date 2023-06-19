package com.test.validation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContractTypeValidator implements ConstraintValidator<ContractTypeValid, String>{

	@Override
	public boolean isValid(String contractType, ConstraintValidatorContext context) {

		List<String> contractTypes = Arrays.asList("fulltime","parttime");
		return contractTypes.contains(contractType);
	}

}
