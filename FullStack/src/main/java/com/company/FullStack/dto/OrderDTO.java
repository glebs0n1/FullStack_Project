package com.company.FullStack.dto;

import java.util.ArrayList;
import java.util.List;

public class OrderDTO {
    private Long id;
    private Long customerId;
    private List<ProductDTO> products;
    // Additional fields as per your requirements

    public OrderDTO() {
        products = new ArrayList<>();
    }

    public OrderDTO(Long id, Long customerId, List<ProductDTO> products) {
        this.id = id;
        this.customerId = customerId;
        this.products = products;
    }

    // Getters and setters for the fields

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", products=" + products +
                '}';
    }
}
