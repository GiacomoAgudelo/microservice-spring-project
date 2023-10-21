package com.jack.handler;

import com.jack.dto.AnimalDtoRequest;
import com.jack.dto.AnimalDtoResponse;
import com.jack.service.AnimalServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class AnimalHandlerTest {

    @InjectMocks
    private AnimalHandler animalHandler;

    @Mock
    private AnimalServiceImpl animalService;


    @Test
    @DisplayName("callCreateAnimal")
    public void givenValidInputWhenCallCreateAnimalThenReturnOptinalDto() throws Exception {
        //Given
        AnimalDtoRequest animalDtoRequest =
                AnimalDtoRequest
                        .builder()
                        .name("ciao")
                        .build();

        AnimalDtoResponse animalDtoResponse =
                AnimalDtoResponse
                        .builder()
                        .name("ciao")
                        .build();

        BDDMockito.given(animalService.createAnimal(Mockito.any(AnimalDtoRequest.class)))
                .willReturn(Optional.of(animalDtoResponse));

        // When
        Optional<AnimalDtoResponse> response = animalHandler.createAnimal(animalDtoRequest);

        // Then

        Assertions.assertTrue(response.isPresent());
        Assertions.assertNotNull(response.get());
        AnimalDtoResponse animalDto = response.get();
        Assertions.assertEquals(animalDto.getName(), animalDtoRequest.getName());
    }

}
