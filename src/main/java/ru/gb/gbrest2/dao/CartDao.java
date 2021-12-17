package ru.gb.gbrest2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.gbrest2.entity.Cart;

public interface CartDao extends JpaRepository<Cart, Long> {

}
