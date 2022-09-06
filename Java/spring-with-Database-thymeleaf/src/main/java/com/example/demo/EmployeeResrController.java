package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResrController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping(value ="/rest", method= RequestMethod.GET)
    public List<Employee> listAllEmployee() {  // coming from JAX-RS library
		return employeeRepository.findAll();
		}
	
	@GetMapping("/rest/{id}") // This is coming Spring boot
    public Optional<Employee> listOneEmployee(@PathVariable Long id) {
        return employeeRepository.findById(id);
    }
    @PostMapping("/rest") // This is coming Spring boot
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
    @PutMapping("/rest") // This is coming Spring boot
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
    @DeleteMapping("/rest") // This is coming Spring boot
    public Employee deleteEmployee(@RequestBody Employee employee) {
    	employeeRepository.delete(employee);
    	return employee;
    }
}
