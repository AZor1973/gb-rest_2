//package ru.gb.gbrest2.service;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//import ru.gb.gbrest.dao.CartDao;
//import ru.gb.gbrest.entity.Cart;
//import ru.gb.gbrest.entity.Product;
//
//
//import java.util.Optional;
//import java.util.Set;
//
//@Service
//@RequiredArgsConstructor
//@Slf4j
//public class CartService {
//
//    private final CartDao cartDao;
//    private final ProductService productService;
//    Cart cart = new Cart();
//
//    public void addProductByProductId(Long id) {
//        Product product = productService.findById(id);
//        cart.addProduct(product);
//        cartDao.save(cart);
//    }
//
//    public Set<Product> findAll() {
//        Optional<Cart> optionalCart = cartDao.findById(1L);
//        optionalCart.ifPresent(value -> cart = value);
//        return cart.getProducts();
//    }
//
//    public void deleteById(Long id) {
//        Optional<Cart> optionalCart = cartDao.findById(1L);
//        optionalCart.ifPresent(value -> cart = value);
//        Set<Product> products = cart.getProducts();
//        products.removeIf(product -> product.getId().equals(id));
//        cartDao.save(cart);
//    }
//}
