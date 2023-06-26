package com.company.FullStack.repository;

import com.company.FullStack.model.Product;
import com.company.FullStack.dto.ProductDTO;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public ProductDTO createProduct(ProductDTO product) {
        // Implement the creation logic for a ProductDTO
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        products.add(product);
        return product;
    }

    @Override
    public Product updateProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(product.getId())) {
                products.set(i, product);
                return product;
            }
        }
        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }
}
