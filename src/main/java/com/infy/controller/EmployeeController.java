package com.infy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.Employee;
import com.infy.repository.EmployeeRepository;

@RestController
@RequestMapping("/emp")

public class EmployeeController {
	@Autowired
	EmployeeRepository repo;
	@GetMapping("/getemp/{id}")
	public Employee getEmp(@PathVariable ("id") int id) {
	 return repo.findById(id).get();
	}
	 @PostMapping("/addemp")
	 public Employee addEmp( @RequestBody Employee e) {
		 return repo.save(e);
	 }
	
	}

