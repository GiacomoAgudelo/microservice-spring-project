package com.jack.services;

import com.jack.dto.BookRequestDto;
import com.jack.dto.BookResponseDto;

import java.util.Collection;
import java.util.Optional;

public interface BookService {

    Optional<BookResponseDto> createBook(final BookRequestDto bookRequestDto) throws Exception;

    Collection<BookResponseDto> retriveBooks();

    void deleteBook(final Long idBook);
}
