 package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.EmpRepo;


@Controller
public class MySampleController {

	@Autowired
	EmpRepo repo;
	
	@RequestMapping(value = "/")
	public String myhomepage() {
		return "NewFile";
	}
	@RequestMapping(value = "/addEmployee")
	public String addEmp(Employee employee)
	{
		repo.save(employee);
		return "NewFile";
	}
}
