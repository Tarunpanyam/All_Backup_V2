package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.TransferType;

public interface TransferTypeRepository extends JpaRepository<TransferType, String>{

}
