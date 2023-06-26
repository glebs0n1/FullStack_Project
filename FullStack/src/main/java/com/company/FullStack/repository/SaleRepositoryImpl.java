package com.company.FullStack.repository;

import com.company.FullStack.model.Sale;
import java.util.ArrayList;
import java.util.List;

public class SaleRepositoryImpl implements SaleRepository {
    private List<Sale> sales = new ArrayList<>();

    @Override
    public List<Sale> getAllSales() {
        return sales;
    }

    @Override
    public Sale getSaleById(Long id) {
        for (Sale sale : sales) {
            if (sale.getId().equals(id)) {
                return sale;
            }
        }
        return null;
    }

    @Override
    public Sale createSale(Sale sale) {
        sales.add(sale);
        return sale;
    }

    @Override
    public Sale updateSale(Sale sale) {
        for (int i = 0; i < sales.size(); i++) {
            if (sales.get(i).getId().equals(sale.getId())) {
                sales.set(i, sale);
                return sale;
            }
        }
        return null;
    }

    @Override
    public void deleteSale(Long id) {
        sales.removeIf(sale -> sale.getId().equals(id));
    }
}
