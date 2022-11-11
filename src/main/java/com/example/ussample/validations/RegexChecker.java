package com.example.ussample.validations;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER,ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = RegexValidator.class)
public @interface RegexChecker {
    public String message() default  "Regex validation error";
    public  String regex() default ".*";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
