package com.company.FullStack.model;

public class Sale {
    private Long id;
    private Product product;
    private int quantity;
    // Additional fields as per your requirements

    public Sale() {
    }

    public Sale(Long id, Product product, int quantity) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
    }

    // Getters and setters for the fields

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
