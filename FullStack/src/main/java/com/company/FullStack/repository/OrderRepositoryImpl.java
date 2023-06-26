package com.company.FullStack.repository;

import com.company.FullStack.model.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {
    private List<Order> orders = new ArrayList<>();

    @Override
    public List<Order> getAllOrders() {
        return orders;
    }

    @Override
    public Order getOrderById(Long id) {
        for (Order order : orders) {
            if (order.getId().equals(id)) {
                return order;
            }
        }
        return null;
    }

    @Override
    public Order createOrder(Order order) {
        orders.add(order);
        return order;
    }

    @Override
    public Order updateOrder(Order order) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId().equals(order.getId())) {
                orders.set(i, order);
                return order;
            }
        }
        return null;
    }

    @Override
    public void deleteOrder(Long id) {
        orders.removeIf(order -> order.getId().equals(id));
    }
}
