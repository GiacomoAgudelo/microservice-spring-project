package com.jack.dto;

import com.jack.validations.annotations.BookCreateValidation;
import com.jack.validations.annotations.BookUpdateValidation;
import com.jack.validations.cases.BookGroup;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@BookCreateValidation(groups = {
        BookGroup.Create.class
})
@BookUpdateValidation(groups = {
        BookGroup.Update.class
})
public class BookRequestDto implements Serializable {

    public String id;

}
