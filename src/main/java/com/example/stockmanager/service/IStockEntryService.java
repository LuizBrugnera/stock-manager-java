package com.example.stockmanager.service;

import com.example.stockmanager.model.StockEntry;
import java.util.List;

public interface IStockEntryService {
    List<StockEntry> listAll();
    StockEntry findById(Long id);
    StockEntry create(StockEntry stockEntry);
    StockEntry update(StockEntry stockEntry);
    void delete(Long id);
}
