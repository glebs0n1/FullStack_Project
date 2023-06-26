package com.company.FullStack.repository;

import com.company.FullStack.model.Product;
import com.company.FullStack.dto.ProductDTO;
import java.util.List;

public interface ProductRepository {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    ProductDTO createProduct(ProductDTO product);
    Product createProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Long id);
}
