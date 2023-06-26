package com.company.FullStack.model;

public class Product {
    private Long id;
    private String name;
    private double price;
    // Additional fields as per your requirements

    public Product() {
    }

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters and setters for the fields

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
