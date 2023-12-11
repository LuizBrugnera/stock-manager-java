package com.example.stockmanager.controller;

import com.example.stockmanager.model.Product;
import com.example.stockmanager.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    private ResponseEntity<?> listAll() {
        return ResponseEntity.ok(productService.listAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.findById(id));
    }

    @PostMapping
    private ResponseEntity<?> create(@RequestBody Product product) {
        return ResponseEntity.ok(productService.create(product));
    }

    @PutMapping("/{id}")
    private ResponseEntity<?> update(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        return ResponseEntity.ok(productService.update(product));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<?> delete(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.ok(null);
    }
}
