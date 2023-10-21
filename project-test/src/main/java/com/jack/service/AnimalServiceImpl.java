package com.jack.service;

import com.jack.dto.AnimalDtoRequest;
import com.jack.repository.AnimalRepository;
import com.jack.assembler.AnimalAssembler;
import com.jack.dto.AnimalDtoResponse;
import com.jack.entity.AnimalEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class AnimalServiceImpl implements AnimalService{

    private final AnimalRepository animalRepository;

    private final AnimalAssembler animalAssembler;

    @Override
    public Optional<AnimalDtoResponse> createAnimal(final AnimalDtoRequest animalDtoRequest) throws Exception {
        AnimalEntity animalEntity = animalAssembler.assembleEntity(animalDtoRequest).orElseThrow(Exception::new);
        animalEntity = Optional.ofNullable(animalRepository.save(animalEntity)).orElseThrow(Exception::new);
        return animalAssembler.assembleResponse(animalEntity);
    }
}
