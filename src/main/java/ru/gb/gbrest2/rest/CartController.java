package ru.gb.gbrest2.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gb.gbrest2.dto.ProductDto;
import ru.gb.gbrest2.service.feign.CartApi;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {
    private final CartApi cartApi;

    @PostMapping
    public void createCart() {
        cartApi.createCart();
    }

    @DeleteMapping("/delete/{cartId}")
    public void deleteCart(@PathVariable Long cartId) {
        cartApi.deleteCart(cartId);
    }

    @PostMapping(path = "/{cartId}", consumes = "application/json;charset=UTF-8")
    public void addProductToCart(@RequestBody ProductDto productDto, @PathVariable Long cartId){
        cartApi.addProductToCart(productDto, cartId);
    }

    @DeleteMapping("/{cartId}/{productId}")
    public void deleteProductById(@PathVariable Long cartId, @PathVariable Long productId){
        cartApi.deleteProductById(cartId, productId);
    }
}
