package com.example.stockmanager.service.impl;

import com.example.stockmanager.model.SalesOrder;
import com.example.stockmanager.repository.ISalesOrderRepository;
import com.example.stockmanager.service.ISalesOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesOrderService implements ISalesOrderService {

    @Autowired
    private ISalesOrderRepository salesOrderRepository;
    @Override
    public List<SalesOrder> listAll() {
        return salesOrderRepository.findAll();
    }

    @Override
    public SalesOrder findById(Long id) {
        return salesOrderRepository.findById(id).orElse(null);
    }

    @Override
    public SalesOrder create(SalesOrder salesOrder) {
        return salesOrderRepository.save(salesOrder);
    }

    @Override
    public SalesOrder update(SalesOrder salesOrder) {
        return salesOrderRepository.save(salesOrder);
    }

    @Override
    public void delete(Long id) {
        salesOrderRepository.deleteById(id);
    }
}
