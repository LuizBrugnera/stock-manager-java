package com.example.stockmanager.repository;

import com.example.stockmanager.model.SalesOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISalesOrderRepository extends JpaRepository<SalesOrder, Long> {
}
