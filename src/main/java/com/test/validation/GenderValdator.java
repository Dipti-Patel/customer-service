package com.test.validation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GenderValdator implements ConstraintValidator<GenderValid, String>{

	@Override
	public boolean isValid(String gender, ConstraintValidatorContext context) {

		List<String> genderTypes = Arrays.asList("M","F");
		return genderTypes.contains(gender);
	}

}
