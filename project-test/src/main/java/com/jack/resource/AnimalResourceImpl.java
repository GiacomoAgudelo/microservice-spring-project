package com.jack.resource;

import com.jack.dto.AnimalDtoRequest;
import com.jack.dto.AnimalDtoResponse;
import com.jack.handler.AnimalHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class AnimalResourceImpl implements AnimalResource {

    private final AnimalHandler animalHandler;


    @Override
    public ResponseEntity<Void> createAnimal(final AnimalDtoRequest animalDtoRequest) throws Exception {
        Optional<AnimalDtoResponse> optionalAnimalDtoResponse =  animalHandler.createAnimal(animalDtoRequest);
        HttpStatus status = null;
        if(optionalAnimalDtoResponse.isPresent()){
            status = HttpStatus.CREATED;
        }else{
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return ResponseEntity.status(status).build();
    }
}
