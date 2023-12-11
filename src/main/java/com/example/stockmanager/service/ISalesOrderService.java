package com.example.stockmanager.service;

import com.example.stockmanager.model.SalesOrder;
import java.util.List;

public interface ISalesOrderService {
    List<SalesOrder> listAll();
    SalesOrder findById(Long id);
    SalesOrder create(SalesOrder salesOrder);
    SalesOrder update(SalesOrder salesOrder);
    void delete(Long id);
}
