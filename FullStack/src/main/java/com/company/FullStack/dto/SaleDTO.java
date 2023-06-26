package com.company.FullStack.dto;

import java.time.LocalDate;

public class SaleDTO {
    private Long id;
    private Long orderId;
    private LocalDate saleDate;
    // Additional fields as per your requirements

    public SaleDTO() {
    }

    public SaleDTO(Long id, Long orderId, LocalDate saleDate) {
        this.id = id;
        this.orderId = orderId;
        this.saleDate = saleDate;
    }

    // Getters and setters for the fields

    @Override
    public String toString() {
        return "SaleDTO{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", saleDate=" + saleDate +
                '}';
    }
}
