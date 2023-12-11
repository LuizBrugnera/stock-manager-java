package com.example.stockmanager.repository;

import com.example.stockmanager.model.StockOutput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockOutputRepository extends JpaRepository<StockOutput, Long> {
}
