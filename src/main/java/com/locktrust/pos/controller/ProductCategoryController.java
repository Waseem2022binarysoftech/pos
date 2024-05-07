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

import com.locktrust.pos.Dto.ProductCategoryDto;
import com.locktrust.pos.Entity.ProductCategory;
import com.locktrust.pos.Service.ProductCategoryService;

@RestController
@RequestMapping("/product_category")
public class ProductCategoryController {

	@Autowired
	private ProductCategoryService service;

	@PostMapping(path = "/create")
	private ProductCategory create(@RequestBody ProductCategoryDto dto) {
		return service.create(dto);
	}

	@PutMapping(path = "/update/{uid}")
	private void update(@PathVariable UUID uid, @RequestBody ProductCategoryDto dto) {
		service.update(uid, dto);
	}

	@GetMapping(path = "/{uid}")
	private ProductCategory retrieve(@PathVariable UUID uid) {
		return service.retrive(uid);
	}

	@GetMapping(path = "/all")
	private List<ProductCategory> getAll() {
		return service.getAll();
	}

	@DeleteMapping(path = "/delete/{uid}")
	private void delete(@PathVariable UUID uid) {
		service.delete(uid);
	}

}
