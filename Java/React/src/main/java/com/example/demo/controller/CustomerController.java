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


import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@CrossOrigin("http://localhost:3000/")
@RestController
//@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/customer")
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
	
	@GetMapping("/customer/{customerId}")
	public Customer getCustomerById(@PathVariable String customerId) {
		return customerRepository.findById(customerId).orElseThrow(RuntimeException::new);
	}
	
	@PostMapping("/customer")
	public void postCustomer(@RequestBody Customer customer) {
		customerRepository.save(customer);
	}

}
