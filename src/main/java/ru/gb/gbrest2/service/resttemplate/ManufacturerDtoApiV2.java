package ru.gb.gbrest2.service.resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.gb.gbrest2.dto.ManufacturerDto;

import java.net.URI;

@Component
public class ManufacturerDtoApiV2 {

    private static final String URL ="http://localhost:8456/manufacturer";
    private final RestTemplate restTemplate;

    @Autowired
    public ManufacturerDtoApiV2(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }

    public ManufacturerDto create(ManufacturerDto manufacturerDto){
        return restTemplate.postForObject(URI.create(URL), manufacturerDto, ManufacturerDto.class);
    }
}