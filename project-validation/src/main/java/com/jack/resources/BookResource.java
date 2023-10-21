package com.jack.resources;

import com.jack.dto.BookRequestDto;
import com.jack.validations.cases.BookGroup;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/api/tests")
public class BookResource {

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createBook(final @RequestBody @Validated({BookGroup.Create.class}) BookRequestDto bookRequestDto){
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/{idBook}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createBook(final @RequestBody @Validated({BookGroup.Update.class}) BookRequestDto bookRequestDto,
                                           final @PathVariable("idBook") Long idBook){
        return ResponseEntity.ok().build();
    }
}
