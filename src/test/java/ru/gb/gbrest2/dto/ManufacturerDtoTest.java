package ru.gb.gbrest2.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;


@JsonTest
class ManufacturerDtoTest {

    @Autowired
    ObjectMapper objectMapper;

    private ManufacturerDto manufacturerDto;

    @BeforeEach
    void setUp() {
        manufacturerDto = ManufacturerDto.builder()
                .id(1L)
                .name("Test_Company")
                .build();
    }

    @Test
    void testSerializeDto() throws JsonProcessingException {
        String json = objectMapper.writeValueAsString(manufacturerDto);
        System.out.println(json);
    }

    @Test
    void testDeSerializeDto() throws JsonProcessingException {
        String json = "{\"manufacturerId\":1,\"name\":\"Test_Company\"}";
        ManufacturerDto testManufacturerDto = objectMapper.readValue(json, ManufacturerDto.class);
        System.out.println(testManufacturerDto);
    }
}