package com.example.stockmanager.service.impl;

import com.example.stockmanager.model.StockEntry;
import com.example.stockmanager.repository.IStockEntryRepository;
import com.example.stockmanager.service.IStockEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockEntryService implements IStockEntryService {

    @Autowired
    private IStockEntryRepository stockEntryRepository;

    @Override
    public List<StockEntry> listAll() {
        return stockEntryRepository.findAll();
    }

    @Override
    public StockEntry findById(Long id) {
        return stockEntryRepository.findById(id).orElse(null);
    }

    @Override
    public StockEntry create(StockEntry stockEntry) {
        return stockEntryRepository.save(stockEntry);
    }

    @Override
    public StockEntry update(StockEntry stockEntry) {
        return stockEntryRepository.save(stockEntry);
    }

    @Override
    public void delete(Long id) {
        stockEntryRepository.deleteById(id);
    }
}
