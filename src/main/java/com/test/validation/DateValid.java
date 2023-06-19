package com.test.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {DateValidator.class})
public @interface DateValid {
 
	 public String message() default "DOB should be <01-01-2002";

	 Class<?>[] groups() default {};

	 Class<? extends Payload>[] payload() default {};
	 
}
