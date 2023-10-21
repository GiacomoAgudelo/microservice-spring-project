package com.jack.assembler;

import com.jack.dto.BookRequestDto;
import com.jack.dto.BookResponseDto;
import com.jack.entities.BookEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BookAssembler {


    public Optional<BookEntity> assembleEntity(final BookRequestDto bookRequestDto){
        BookEntity bookEntity = BookEntity
                .builder()
                .id(bookRequestDto.getId())
                .name(bookRequestDto.getName())
                .price(bookRequestDto.getPrice())
                .build();

        return Optional.ofNullable(bookEntity);
    }


    public Optional<BookResponseDto> assembleResponse(final BookEntity bookEntity){
        BookResponseDto bookResponseDto = BookResponseDto
                .builder()
                .id(bookEntity.getId())
                .name(bookEntity.getName())
                .price(bookEntity.getPrice())
                .build();

        return Optional.ofNullable(bookResponseDto);
    }

}
