package com.test.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateValidator implements ConstraintValidator<DateValid, String> {

	@Override
	public boolean isValid(String date, ConstraintValidatorContext context) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Date date1 = null;
		Date date2 = null ;
		try {
			date1 = sdf.parse(date);
			date2 = sdf.parse("2002-01-01");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

		
		return date1.before(date2);
	}

}
