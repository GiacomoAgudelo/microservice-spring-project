package com.jack.documentation.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "BookRequestDto", description = "This schema will use to do book operation like create, update and patch")
public class BookRequestDto implements Serializable {

    @Schema(name = "name", description = "this parameter is mandatory")
    private String name;

}
