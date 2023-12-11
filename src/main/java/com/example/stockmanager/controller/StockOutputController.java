package com.example.stockmanager.controller;

import com.example.stockmanager.model.StockEntry;
import com.example.stockmanager.model.StockOutput;
import com.example.stockmanager.service.impl.StockOutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/stockoutput")
public class StockOutputController {

    @Autowired
    private StockOutputService stockOutputService;

    @GetMapping
    private ResponseEntity<?> listAll() {
        return ResponseEntity.ok(stockOutputService.listAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(stockOutputService.findById(id));
    }

    @PostMapping
    private ResponseEntity<?> create(@RequestBody StockOutput stockOutput) {
        return ResponseEntity.ok(stockOutputService.create(stockOutput));
    }

    @PutMapping("/{id}")
    private ResponseEntity<?> update(@PathVariable Long id, @RequestBody StockOutput stockOutput) {
        stockOutput.setId(id);
        return ResponseEntity.ok(stockOutputService.update(stockOutput));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<?> delete(@PathVariable Long id) {
        stockOutputService.delete(id);
        return ResponseEntity.ok(null);
    }
}
