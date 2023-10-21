package com.jack.resource;

import com.jack.dto.AnimalDtoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("v1/api/animals")
public interface AnimalResource {

    @PostMapping("")
    public ResponseEntity<Void> createAnimal(final @RequestBody AnimalDtoRequest animalDtoRequest) throws Exception;

}
