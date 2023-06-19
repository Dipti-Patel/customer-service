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
@Constraint(validatedBy = {GenderValdator.class})
public @interface GenderValid {
 
	 public String message() default "Sex should be M or F";

	 Class<?>[] groups() default {};

	 Class<? extends Payload>[] payload() default {};
	 
}
