package com.example.stockmanager.repository;

import com.example.stockmanager.model.StockOutput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStockOutputRepository extends JpaRepository<StockOutput, Long> {
}
