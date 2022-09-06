package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Transaction;
import com.example.demo.repository.BankRepository;
import com.example.demo.repository.CustomersRepository;
import com.example.demo.repository.MessageCodeRepository;
import com.example.demo.repository.TransactionRepository;
import com.example.demo.repository.*;
//
//@CrossOrigin("*")
@RestController
public class TransactionController {

	@Autowired
	private TransactionRepository transactionRepo;
	@Autowired
	private CustomersRepository customerRepo;
	@Autowired
	private MessageCodeRepository messageRepo;
	@Autowired
	private BankRepository bankRepo;


	@GetMapping("/transaction")
	public List<Transaction> getTranasactions() {
		return transactionRepo.findAll();
	}
	
	@PostMapping("/transaction")
	public Transaction createTransaction(@RequestBody Transaction transaction) {
		return transactionRepo.save(transaction);
	}
	@GetMapping("/transaction/{id}")
	public Transaction getBank(@PathVariable long id) {
		return transactionRepo.findById(id).orElseThrow(RuntimeException::new);
	}



}
