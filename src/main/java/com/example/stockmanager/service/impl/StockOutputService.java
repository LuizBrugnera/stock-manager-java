package com.example.stockmanager.service.impl;

import com.example.stockmanager.model.StockOutput;
import com.example.stockmanager.repository.IStockOutputRepository;
import com.example.stockmanager.service.IStockOutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockOutputService implements IStockOutputService {

    @Autowired
    private IStockOutputRepository stockOutputRepository;

    @Override
    public List<StockOutput> listAll() {
        return stockOutputRepository.findAll();
    }

    @Override
    public StockOutput findById(Long id) {
        return stockOutputRepository.findById(id).orElse(null);
    }

    @Override
    public StockOutput create(StockOutput stockOutput) {
        return stockOutputRepository.save(stockOutput);
    }

    @Override
    public StockOutput update(StockOutput stockOutput) {
        return stockOutputRepository.save(stockOutput);
    }

    @Override
    public void delete(Long id) {
        stockOutputRepository.deleteById(id);
    }
}
