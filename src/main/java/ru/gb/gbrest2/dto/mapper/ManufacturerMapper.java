package ru.gb.gbrest2.dto.mapper;


import org.mapstruct.Mapper;
import ru.gb.gbrest2.dto.ManufacturerDto;
import ru.gb.gbrest2.entity.Manufacturer;

@Mapper
public interface ManufacturerMapper {
    ManufacturerDto toManufacturerDto(Manufacturer manufacturer);
    Manufacturer toManufacturer(ManufacturerDto manufacturerDto);
}