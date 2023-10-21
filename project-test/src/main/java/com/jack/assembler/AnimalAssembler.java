package com.jack.assembler;

import com.jack.dto.AnimalDtoRequest;
import com.jack.dto.AnimalDtoResponse;
import com.jack.entity.AnimalEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AnimalAssembler {


    public Optional<AnimalEntity> assembleEntity(final AnimalDtoRequest animalDtoRequest){
        AnimalEntity animalEntity =  AnimalEntity
                .builder()
                .name(animalDtoRequest.getName())
                .build();

        return Optional.ofNullable(animalEntity);
    }

    public Optional<AnimalDtoResponse> assembleResponse(final AnimalEntity animalEntity){
        AnimalDtoResponse animalDtoResponse =
                AnimalDtoResponse
                        .builder()
                        .name(animalEntity.getName())
                        .build();

        return Optional.ofNullable(animalDtoResponse);
    }

}
