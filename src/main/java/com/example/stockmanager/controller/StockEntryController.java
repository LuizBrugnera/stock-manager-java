package com.example.stockmanager.controller;

import com.example.stockmanager.model.SalesOrder;
import com.example.stockmanager.model.StockEntry;
import com.example.stockmanager.service.impl.StockEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/stockentry")
public class StockEntryController {

    @Autowired
    private StockEntryService stockEntryService;

    @GetMapping
    private ResponseEntity<?> listAll() {
        return ResponseEntity.ok(stockEntryService.listAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(stockEntryService.findById(id));
    }

    @PostMapping
    private ResponseEntity<?> create(@RequestBody StockEntry stockEntry) {
        return ResponseEntity.ok(stockEntryService.create(stockEntry));
    }

    @PutMapping("/{id}")
    private ResponseEntity<?> update(@PathVariable Long id, @RequestBody StockEntry stockEntry) {
        stockEntry.setId(id);
        return ResponseEntity.ok(stockEntryService.update(stockEntry));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<?> delete(@PathVariable Long id) {
        stockEntryService.delete(id);
        return ResponseEntity.ok(null);
    }
}
