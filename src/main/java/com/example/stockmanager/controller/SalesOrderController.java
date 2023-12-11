package com.example.stockmanager.controller;

import com.example.stockmanager.model.Category;
import com.example.stockmanager.model.SalesOrder;
import com.example.stockmanager.service.impl.SalesOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/salesorder")
public class SalesOrderController {

    @Autowired
    private SalesOrderService salesOrderService;

    @GetMapping
    private ResponseEntity<?> listAll() {
        return ResponseEntity.ok(salesOrderService.listAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(salesOrderService.findById(id));
    }

    @PostMapping
    private ResponseEntity<?> create(@RequestBody SalesOrder salesOrder) {
        return ResponseEntity.ok(salesOrderService.create(salesOrder));
    }

    @PutMapping("/{id}")
    private ResponseEntity<?> update(@PathVariable Long id, @RequestBody SalesOrder salesOrder) {
        salesOrder.setId(id);
        return ResponseEntity.ok(salesOrderService.update(salesOrder));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<?> delete(@PathVariable Long id) {
        salesOrderService.delete(id);
        return ResponseEntity.ok(null);
    }
}
