package ru.gb.gbrest2.dto.mapper;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.gb.gbrest2.dao.ManufacturerDao;
import ru.gb.gbrest2.dto.ProductDto;
import ru.gb.gbrest2.dto.ProductManufacturerDto;
import ru.gb.gbrest2.entity.Manufacturer;
import ru.gb.gbrest2.entity.Product;

import java.util.NoSuchElementException;

@Mapper(uses = ManufacturerMapper.class)
public interface ProductMapper {

    Product toProduct(ProductDto productDto, @Context ManufacturerDao manufacturerDao);

    ProductDto toProductDto(Product product);
//source = "manufacturer", target = "manufacturerDto"
    @Mapping(source = "manufacturer", target = "manufacturerDto")
    ProductManufacturerDto toProductManufacturerDto(Product product);

    default Manufacturer getManufacturer(String manufacturer, @Context ManufacturerDao manufacturerDao){
        return manufacturerDao.findByName(manufacturer).orElseThrow(NoSuchElementException::new);
    }

    default String getManufacturer(Manufacturer manufacturer){
        return manufacturer.getName();
    }
}
