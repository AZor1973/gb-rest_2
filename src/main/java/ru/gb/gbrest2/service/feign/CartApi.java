package ru.gb.gbrest2.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import ru.gb.gbrest2.dto.ProductDto;

@FeignClient(url = "localhost:8456/cart", value = "CartApi")
public interface CartApi {

    @PostMapping
    void createCart();

    @DeleteMapping("/delete/{cartId}")
    void deleteCart(@PathVariable Long cartId);

    @PostMapping(path = "/{cartId}", consumes = "application/json;charset=UTF-8")
    void addProductToCart(@RequestBody ProductDto productDto, @PathVariable Long cartId);

    @DeleteMapping("/{cartId}/{productId}")
    void deleteProductById(@PathVariable Long cartId, @PathVariable Long productId);
}
