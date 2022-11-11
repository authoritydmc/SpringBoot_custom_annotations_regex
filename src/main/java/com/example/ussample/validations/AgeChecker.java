package com.example.ussample.validations;


import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import java.lang.annotation.*;



@Target({ElementType.FIELD,ElementType.PARAMETER,ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = AgeValidator.class)
public @interface AgeChecker {
    public int age() default 18;
    public String message() default  "Age validation error";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
