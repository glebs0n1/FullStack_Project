package com.company.FullStack.model;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private Long id;
    private Customer customer;
    private LocalDate orderDate;
    private List<Product> products;

    public Order() {
    }

    public Order(Long id, Customer customer, LocalDate orderDate, List<Product> products) {
        this.id = id;
        this.customer = customer;
        this.orderDate = orderDate;
        this.products = products;
    }

    // Getters and setters for the fields

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", orderDate=" + orderDate +
                ", products=" + products +
                '}';
    }
}
