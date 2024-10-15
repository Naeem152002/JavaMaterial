package com.onlineshoppingsystem.service.order;

import com.onlineshoppingsystem.dto.OrderDto;
import com.onlineshoppingsystem.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
