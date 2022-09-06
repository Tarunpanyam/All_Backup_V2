package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Bank;

public interface BankRepository extends JpaRepository<Bank, String> {
	
}
