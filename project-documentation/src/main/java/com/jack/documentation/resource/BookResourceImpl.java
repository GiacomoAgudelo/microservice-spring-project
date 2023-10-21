package com.jack.documentation.resource;

import com.jack.documentation.dtos.BookRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookResourceImpl implements BookResource {


    @Override
    public ResponseEntity<Void> createBook(final BookRequestDto bookRequestDto) {
        return null;
    }
}
