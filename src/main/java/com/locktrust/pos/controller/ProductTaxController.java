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

import com.locktrust.pos.Dto.ProductTaxDto;
import com.locktrust.pos.Entity.ProductTax;
import com.locktrust.pos.Service.ProductTaxService;

@RestController
@RequestMapping("/product_tax")
public class ProductTaxController {

	@Autowired
	private ProductTaxService service;

	@PostMapping(path = "/create")
	private ProductTax create(@RequestBody ProductTaxDto dto) {
		return service.create(dto);
	}

	@PutMapping(path = "/update/{uid}")
	private ProductTax update(@PathVariable UUID uid, @RequestBody ProductTaxDto dto) {
		return service.update(uid, dto);
	}

	@GetMapping(path = "/{uid}")
	private ProductTax retrieve(@PathVariable UUID uid) {
		return service.retrive(uid);
	}

	@GetMapping(path = "/all")
	private List<ProductTax> getAll() {
		return service.getAll();
	}

	@DeleteMapping(path = "/delete/{uid}")
	private void delete(@PathVariable UUID uid) {
		service.delete(uid);
	}
	
}
