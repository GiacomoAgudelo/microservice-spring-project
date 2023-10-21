package com.jack.dto;

import com.jack.common.ResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class ProductResponse extends ResponseDto {

    private String productName;

    //TODO successivamente farlo diventare un enum
    private String productType;
}
