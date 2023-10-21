package com.jack.validations.implementations;

import com.jack.dto.BookRequestDto;
import com.jack.validations.annotations.BookCreateValidation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class BookCreateValidator implements ConstraintValidator<BookCreateValidation, BookRequestDto> {

    @Override
    public boolean isValid(final BookRequestDto bookRequestDto, final ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
