package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{
}
