package com.example.stockmanager.controller;

import com.example.stockmanager.model.StockOutput;
import com.example.stockmanager.model.Supplier;
import com.example.stockmanager.service.impl.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping
    private ResponseEntity<?> listAll() {
        return ResponseEntity.ok(supplierService.listAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(supplierService.findById(id));
    }

    @PostMapping
    private ResponseEntity<?> create(@RequestBody Supplier supplier) {
        return ResponseEntity.ok(supplierService.create(supplier));
    }

    @PutMapping("/{id}")
    private ResponseEntity<?> update(@PathVariable Long id, @RequestBody Supplier supplier) {
        supplier.setId(id);
        return ResponseEntity.ok(supplierService.update(supplier));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<?> delete(@PathVariable Long id) {
        supplierService.delete(id);
        return ResponseEntity.ok(null);
    }
}
