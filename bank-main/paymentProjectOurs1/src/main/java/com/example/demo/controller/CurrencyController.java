package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Currency;
import com.example.demo.repository.CurrencyRepository;

@RestController
@RequestMapping("/currency")
public class CurrencyController {
	
	@Autowired
	public CurrencyRepository currencyRepo;

	
	@GetMapping
	public List<Currency> getCustomers() {
		return currencyRepo.findAll();
	}

}
