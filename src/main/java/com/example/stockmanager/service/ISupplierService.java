package com.example.stockmanager.service;

import com.example.stockmanager.model.Supplier;
import java.util.List;

public interface ISupplierService {
    List<Supplier> listAll();
    Supplier findById(Long id);
    Supplier create(Supplier supplier);
    Supplier update(Supplier supplier);
    void delete(Long id);
}
