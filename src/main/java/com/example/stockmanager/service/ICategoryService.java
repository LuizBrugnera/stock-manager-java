package com.example.stockmanager.service;

import com.example.stockmanager.model.Category;
import java.util.List;

public interface ICategoryService {
    List<Category> listAll();
    Category findById(Long id);
    Category create(Category category);
    Category update(Category category);
    void delete(Long id);
}
