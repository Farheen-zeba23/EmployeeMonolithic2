package com.infy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.Office;
import com.infy.repository.OfficeRepository;

@RestController
@RequestMapping("/office")
public class OfficeController {
	@Autowired
	OfficeRepository repo;
    @GetMapping("/officeid/{id}")
	public Office getOfficeId(@PathVariable ("id") int id){
		return repo.findById(id).get();
		
	}

}
