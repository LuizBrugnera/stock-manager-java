package com.example.stockmanager.service.impl;

import com.example.stockmanager.model.Supplier;
import com.example.stockmanager.repository.ISupplierRepository;
import com.example.stockmanager.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService implements ISupplierService {

    @Autowired
    private ISupplierRepository supplierRepository;
    @Override
    public List<Supplier> listAll() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier findById(Long id) {
        return supplierRepository.findById(id).orElse(null);
    }

    @Override
    public Supplier create(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public Supplier update(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public void delete(Long id) {
        supplierRepository.deleteById(id);
    }
}
