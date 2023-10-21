package com.jack.validations.annotations;

import com.jack.validations.implementations.BookUpdateValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target(value = {ElementType.PARAMETER, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {
        BookUpdateValidator.class
})
public @interface BookUpdateValidation {

    Class<?>[] groups() default {};

    String message() default "invalid input";

    Class<? extends Payload>[] payload() default {};

}

