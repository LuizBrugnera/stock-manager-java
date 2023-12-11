package com.example.stockmanager.service;

import com.example.stockmanager.model.StockOutput;
import java.util.List;

public interface IStockOutputService {
    List<StockOutput> listAll();
    StockOutput findById(Long id);
    StockOutput create(StockOutput stockOutput);
    StockOutput update(StockOutput stockOutput);
    void delete(Long id);
}
