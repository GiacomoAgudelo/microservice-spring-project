package com.jack.service;

import com.jack.dto.AnimalDtoRequest;
import com.jack.dto.AnimalDtoResponse;

import java.util.Optional;

public interface AnimalService {

    Optional<AnimalDtoResponse> createAnimal(final AnimalDtoRequest animalDtoRequest) throws Exception;
}
