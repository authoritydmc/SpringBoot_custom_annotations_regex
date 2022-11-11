package com.example.ussample.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator <AgeChecker,Integer>{

    int validAge=999;
    @Override
    public void initialize(AgeChecker constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        validAge=constraintAnnotation.age();

    }

    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println("Age checking "+age);

        constraintValidatorContext.disableDefaultConstraintViolation();
        String message="Age validation : Age must be greater than "+validAge;
        constraintValidatorContext.buildConstraintViolationWithTemplate(message).addConstraintViolation();
        return age>validAge;
    }
}
