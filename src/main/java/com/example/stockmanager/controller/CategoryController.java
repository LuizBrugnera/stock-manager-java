package com.example.stockmanager.controller;

import com.example.stockmanager.model.Category;
import com.example.stockmanager.service.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    private ResponseEntity<?> listAll() {
        return ResponseEntity.ok(categoryService.listAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(categoryService.findById(id));
    }

    @PostMapping
    private ResponseEntity<?> create(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.create(category));
    }

    @PutMapping("/{id}")
    private ResponseEntity<?> update(@PathVariable Long id, @RequestBody Category category) {
        category.setId(id);
        return ResponseEntity.ok(categoryService.update(category));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<?> delete(@PathVariable Long id) {
        categoryService.delete(id);
        return ResponseEntity.ok(null);
    }
}
