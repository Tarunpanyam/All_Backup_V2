package com.example.demo.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.repository.CustomersRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/receiver")
public class ReceiverController {
	
	@Autowired
	private CustomersRepository customerRepo;
	
	@GetMapping("{name}")
	public boolean getCustomer(@PathVariable String name) {
		HashMap<String, Customer> hm = new HashMap<String, Customer>();
		List<Customer> receivers = customerRepo.findAll();
		for (int i = 0; i < receivers.size(); i++)
			hm.put(receivers.get(i).getAccountHolderName(), receivers.get(i));
		System.out.println(Arrays.toString(receivers.toArray()));
		return hm.containsKey(name);
	}

}
