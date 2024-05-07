package com.locktrust.pos.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locktrust.pos.Dto.CustomerDto;
import com.locktrust.pos.Entity.Customer;
import com.locktrust.pos.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@PostMapping(path = "/create")
	private Customer create(@RequestBody CustomerDto dto) {
		
		return service.create(dto);
	}

	@PutMapping(path = "/update/{uid}")
	private Customer update(@PathVariable UUID uid, @RequestBody CustomerDto dto) {
		
		return service.update(uid, dto);
	}

	@GetMapping(path = "/{uid}")
	private Customer retrieve(@PathVariable UUID uid) {
		return service.retrive(uid);
	}

	@GetMapping(path = "/all")
	private List<Customer> getAll() {
		return service.getAll();
	}

	@DeleteMapping(path = "/delete/{uid}")
	private void delete(@PathVariable UUID uid) {
		service.delete(uid);
	}
	
}
