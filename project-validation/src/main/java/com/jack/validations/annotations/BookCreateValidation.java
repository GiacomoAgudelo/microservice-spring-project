package com.jack.validations.annotations;

import com.jack.validations.implementations.BookCreateValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {
        BookCreateValidator.class
})
public @interface BookCreateValidation {

    Class<?>[] groups() default {};
    String message() default "Invalid input";
    Class<? extends Payload>[] payload() default{};

}
