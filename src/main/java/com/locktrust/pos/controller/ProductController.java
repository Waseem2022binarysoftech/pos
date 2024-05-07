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

import com.locktrust.pos.Dto.ProductDto;
import com.locktrust.pos.Entity.Product;
import com.locktrust.pos.Service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping(path = "/create")
	private Product create(@RequestBody ProductDto dto) {
		return service.create(dto);
	}

	@PutMapping(path = "/update/{uid}")
	private Product update(@PathVariable UUID uid, @RequestBody ProductDto dto) {
		return service.update(uid, dto);
	}

	@GetMapping(path = "/{uid}")
	private ProductDto retrieve(@PathVariable UUID uid) {
		return service.retrive(uid);
	}

	@GetMapping(path = "/all")
	private List<Product> getAll() {
		return service.getAll();
	}

	@DeleteMapping(path = "/delete/{uid}")
	private void delete(@PathVariable UUID uid) {
		service.delete(uid);
	}

}
