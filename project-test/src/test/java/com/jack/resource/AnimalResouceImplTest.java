package com.jack.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jack.dto.AnimalDtoRequest;
import com.jack.dto.AnimalDtoResponse;
import com.jack.handler.AnimalHandler;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Optional;

@WebMvcTest(AnimalResourceImpl.class)
@AutoConfigureMockMvc(addFilters = false)
public class AnimalResouceImplTest {

    @MockBean
    private AnimalHandler animalHandler;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @DisplayName("/v1/api/animals")
    public void givenValidInputWhenCallPostCreateAnimalThenReturn201Created() throws Exception {
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

        String input = objectMapper.writeValueAsString(animalDtoRequest);

        BDDMockito.given(animalHandler.createAnimal(Mockito.any(AnimalDtoRequest.class)))
                .willReturn(Optional.of(animalDtoResponse));

        // when
        ResultActions response =  mockMvc.perform(MockMvcRequestBuilders.post("/v1/api/animals")
                .contentType(MediaType.APPLICATION_JSON)
                .content(input));

        //Then
        response.andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isCreated());

    }
}
