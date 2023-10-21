package com.jack.handler;

import com.jack.dto.BookRequestDto;
import com.jack.dto.BookResponseDto;
import com.jack.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collection;


@Component
@RequiredArgsConstructor
public class BookHandler {

    private final BookService bookService;

    public void createBook(final BookRequestDto bookRequestDto) throws Exception {
        bookService.createBook(bookRequestDto);
    }

    public Collection<BookResponseDto> retriveBooks(){
        return bookService.retriveBooks();
    }

    public void deleteBook(final Long idBook) {
        bookService.deleteBook(idBook);
    }
}
