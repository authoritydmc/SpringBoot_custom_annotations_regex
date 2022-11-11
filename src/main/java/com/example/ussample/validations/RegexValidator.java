package com.example.ussample.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class RegexValidator implements ConstraintValidator <RegexChecker,String>{

    String regexStr=".*";
    @Override
    public void initialize(RegexChecker constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        regexStr=constraintAnnotation.regex();
    }

    @Override
    public boolean isValid(String str, ConstraintValidatorContext context) {

        context.disableDefaultConstraintViolation();
        String message="Regex validation : Failed to match  "+str+" for "+regexStr;
        context.buildConstraintViolationWithTemplate(message).addConstraintViolation();
       return Pattern.compile(regexStr).matcher(str).matches();

    }
}
