package com.onlineshoppingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineshoppingsystem.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUserId(Long userId);
}
