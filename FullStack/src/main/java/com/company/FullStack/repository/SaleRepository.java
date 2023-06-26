package com.company.FullStack.repository;

import com.company.FullStack.model.Sale;
import java.util.List;

public interface SaleRepository {
    List<Sale> getAllSales();
    Sale getSaleById(Long id);
    Sale createSale(Sale sale);
    Sale updateSale(Sale sale);
    void deleteSale(Long id);
}
