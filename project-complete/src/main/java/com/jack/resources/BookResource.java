package com.jack.resources;

import com.jack.dto.BookRequestDto;
import com.jack.dto.BookResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequestMapping("v1/api/books")
public interface BookResource {

    @PostMapping("")
    ResponseEntity<Void> createBook(final @RequestBody BookRequestDto bookRequestDto) throws Exception;

    @GetMapping("")
    ResponseEntity<Collection<BookResponseDto>> retriveBook();


    @DeleteMapping("/{idBook}")
    ResponseEntity<Void> deleteBook(@PathVariable("idBook") final Long idBook);

}
