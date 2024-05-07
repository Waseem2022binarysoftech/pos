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

import com.locktrust.pos.Dto.CouponCodeDto;
import com.locktrust.pos.Entity.CouponCode;
import com.locktrust.pos.Service.CouponCodeService;

@RestController
@RequestMapping("/coupon")
public class CouponCodeController {

	@Autowired
	private CouponCodeService service;

	@PostMapping(path = "/create")
	private CouponCode create(@RequestBody CouponCodeDto dto) {
		return service.create(dto);
	}

	@PutMapping(path = "/update/{uid}")
	private CouponCode update(@PathVariable UUID uid, @RequestBody CouponCodeDto dto) {
		return service.update(uid, dto);
	}

	@GetMapping(path = "/{uid}")
	private CouponCode retrieve(@PathVariable UUID uid) {
		return service.retrive(uid);
	}

	@GetMapping(path = "/all")
	private List<CouponCode> getAll() {
		return service.getAll();
	}

	@DeleteMapping(path = "/delete/{uid}")
	private void delete(@PathVariable UUID uid) {
		service.delete(uid);
	}
}
