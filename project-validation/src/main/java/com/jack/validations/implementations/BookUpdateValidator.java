package com.jack.validations.implementations;

import com.jack.dto.BookRequestDto;
import com.jack.validations.annotations.BookUpdateValidation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class BookUpdateValidator implements ConstraintValidator<BookUpdateValidation, BookRequestDto> {

    @Override
    public boolean isValid(BookRequestDto value, ConstraintValidatorContext context) {
        return false;
    }

}
