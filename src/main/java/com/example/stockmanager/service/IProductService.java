package com.example.stockmanager.service;

import com.example.stockmanager.model.Product;
import java.util.List;

public interface IProductService {
    List<Product> listAll();
    Product findById(Long id);
    Product create(Product product);
    Product update(Product product);
    void delete(Long id);
}
