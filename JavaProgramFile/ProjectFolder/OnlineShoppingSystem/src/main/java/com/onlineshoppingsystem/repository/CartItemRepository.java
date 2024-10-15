package com.onlineshoppingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineshoppingsystem.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    void deleteAllByCartId(Long id);
}
