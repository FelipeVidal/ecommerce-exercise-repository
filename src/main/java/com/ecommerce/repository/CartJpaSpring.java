package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.model.Cart;

public interface CartJpaSpring extends JpaRepository<Cart, Integer>{
    
}
