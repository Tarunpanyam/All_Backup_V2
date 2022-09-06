package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

	
	@RequestMapping("/")
	public String homepage(Model model) {
		//model.addAttribute("empdata",employeeRepository.findById(1L));
		Optional<Employee> emp = employeeRepository.findById(1L);
		
		 log.info("Data being retrived");
	        if (emp.isPresent()) {
	            model.addAttribute("empdata", emp.get());
	            log.info("Available Data " + emp.get());
	        } else {
	            model.addAttribute("empdata", new Employee());
	            log.info("Blank Data " );
	        }
	        return "NewFile";
	    }
	
	@GetMapping("/lst")
    public String lstEmployee(Model model) {
        
        List<Employee> emp = employeeRepository.findAll();
                model.addAttribute("lst_emp", emp);
            log.info("Data Retrives to List" + emp);
    
        return "emptable";
    }

}
