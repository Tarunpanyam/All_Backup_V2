package com.example.demo.controller;

import java.util.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.repository.CustomersRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomersRepository customerRepo;


	@GetMapping
	public List<Customer> getCustomers() {
		return customerRepo.findAll();
	}
	
	@GetMapping("{id}")
	public Customer getCustomer(@PathVariable String id) {
		return customerRepo.findById(id).orElseThrow(RuntimeException::new);
	}

	// update
	@PutMapping("{id}")
	public boolean updateCustomers(@PathVariable String id, @RequestBody Customer customer) {
		Customer currentCustomer = customerRepo.findById(id).orElseThrow(RuntimeException::new);
		currentCustomer.setClearBalance(customer.getClearBalance());
		customerRepo.save(currentCustomer);
		return true;
	}

	// delete
	@DeleteMapping("/{id}")
	public String deleteCustomers(@PathVariable String id) {
		customerRepo.deleteById(id);
		return "Deleted";
	}
//	@GetMapping("{name}")
//	public boolean getReceiver(@RequestBody String name) {
//		System.out.println(name.trim());
//		HashMap<String, Customers> hm = new HashMap<String, Customers>();
//		List<Customers> receivers = customerRepo.findAll();
//		for (int i = 0; i < receivers.size(); i++)
//			hm.put(receivers.get(i).getAccountholdername().trim(), receivers.get(i));
//		System.out.println(Arrays.toString(receivers.toArray()));
//		return hm.containsKey(name.trim());
//	}
}
