package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.entities.Customer;

public interface CustomersRepository extends JpaRepository<Customer, String> {

}
