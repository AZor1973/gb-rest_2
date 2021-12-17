package ru.gb.gbrest2.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.gbrest2.dto.ManufacturerDto;
import ru.gb.gbrest2.service.feign.ManufacturerDtoApi;

@RestController
@RequestMapping("/manufacturer")
@RequiredArgsConstructor
public class ManufacturerController {

    private final ManufacturerDtoApi manufacturerDtoApi;

//    private final ManufacturerDtoApiV2 manufacturerDtoApi;  // через RestTemplate

    @PostMapping
    public ManufacturerDto create(@RequestBody ManufacturerDto manufacturerDto) {
        return manufacturerDtoApi.create(manufacturerDto);
    }
}
