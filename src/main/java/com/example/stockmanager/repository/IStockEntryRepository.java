package com.example.stockmanager.repository;

import com.example.stockmanager.model.StockEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStockEntryRepository extends JpaRepository<StockEntry, Long> {
}
