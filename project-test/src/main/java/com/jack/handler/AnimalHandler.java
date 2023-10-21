package com.jack.handler;

import com.jack.dto.AnimalDtoRequest;
import com.jack.dto.AnimalDtoResponse;
import com.jack.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class AnimalHandler {

    private final AnimalService animalService;

    public Optional<AnimalDtoResponse> createAnimal(final AnimalDtoRequest animalDtoRequest) throws Exception {
        Optional<AnimalDtoResponse> optionalAnimalDtoResponse = animalService.createAnimal(animalDtoRequest);
        return optionalAnimalDtoResponse;
    }
}
