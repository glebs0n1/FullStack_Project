package com.company.FullStack.repository;

import com.company.FullStack.model.Order;
import java.util.List;

public interface OrderRepository {
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order createOrder(Order order);
    Order updateOrder(Order order);
    void deleteOrder(Long id);
}
