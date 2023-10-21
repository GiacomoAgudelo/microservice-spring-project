package com.jack.services;

import com.jack.assembler.BookAssembler;
import com.jack.dto.BookRequestDto;
import com.jack.dto.BookResponseDto;
import com.jack.entities.BookEntity;
import com.jack.repositories.BookRepository;
import com.jack.validations.BookValidation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class BookServiceImpl implements BookService{

    private final BookAssembler bookAssembler;

    private final BookRepository bookRepository;

    private final BookValidation bookValidation;

    @Override
    public Optional<BookResponseDto> createBook(final BookRequestDto bookRequestDto) throws Exception {
        bookValidation.validInputPost(bookRequestDto);
        BookEntity bookEntity = bookAssembler.assembleEntity(bookRequestDto).orElseThrow(Exception::new);
        bookEntity = Optional.ofNullable(bookRepository.save(bookEntity)).orElseThrow();
        return bookAssembler.assembleResponse(bookEntity);
    }

    @Override
    public Collection<BookResponseDto> retriveBooks(){
        Collection<BookEntity> books = bookRepository.findAll();
        if(Objects.nonNull(books) && !books.isEmpty()){
            return books.stream()
                    .map(book -> bookAssembler.assembleResponse(book))
                    .filter(book -> book.isPresent())
                    .map(Optional::get)
                    .collect(Collectors.toSet());

        }
        return new HashSet<>();
    }

    @Override
    public void deleteBook(final Long idBook) {
        bookRepository.deleteById(idBook);
    }
}
