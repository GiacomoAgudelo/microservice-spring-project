package com.jack.dto;

import com.jack.common.RequestDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductRequest extends RequestDto {

    private String productName;

    //TODO successivamente farlo diventare un enum
    private String productType;
}
