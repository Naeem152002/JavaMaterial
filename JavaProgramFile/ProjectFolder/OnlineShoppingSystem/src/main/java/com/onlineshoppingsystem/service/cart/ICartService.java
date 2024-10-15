package com.onlineshoppingsystem.service.cart;

import java.math.BigDecimal;

import com.onlineshoppingsystem.model.Cart;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Long initializeNewCart();

    Cart getCartByUserId(Long userId);
}
