package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Bank;
import com.example.demo.repository.BankRepository;

//@CrossOrigin("*")
@RestController
//@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	public BankRepository bankRepo;
	
	@GetMapping("/bank")
	public List<Bank> getAllBanks() {
		return bankRepo.findAll();
	}
	
	@PostMapping("/bank")
	public String addBank(@RequestBody Bank bank) {
		bankRepo.save(bank);
		return "New Bank added";
	}
	
	@GetMapping("/bank/{id}")
	public Bank getBank(@PathVariable String id) {
		return bankRepo.findById(id).orElseThrow(RuntimeException::new);
//		return bankRepo.findById(id);
	}

}
