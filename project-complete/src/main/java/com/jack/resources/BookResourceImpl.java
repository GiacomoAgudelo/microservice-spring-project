package com.jack.resources;

import com.jack.dto.BookRequestDto;
import com.jack.dto.BookResponseDto;
import com.jack.handler.BookHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
public class BookResourceImpl implements BookResource {

    private final BookHandler bookHandler;

    @Override
    public ResponseEntity<Void> createBook(final BookRequestDto bookRequestDto) throws Exception {
        bookHandler.createBook(bookRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    public ResponseEntity<Collection<BookResponseDto>> retriveBook() {
        return ResponseEntity.ok(bookHandler.retriveBooks());
    }

    @Override
    public ResponseEntity<Void> deleteBook(final Long idBook) {
        bookHandler.deleteBook(idBook);
        return ResponseEntity.noContent().build();
    }
}
