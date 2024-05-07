package com.locktrust.pos.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locktrust.pos.Dto.CustomerDto;
import com.locktrust.pos.Entity.Customer;
import com.locktrust.pos.Repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;

	public Customer create(CustomerDto dto) {

		Customer entity = copyDtoToEntity(dto, null);

		repo.save(entity);

		return entity;

	}

	public Customer update(UUID uid, CustomerDto dto) {

		Customer entity = repo.findByUid(uid).orElse(null);

		repo.save(entity);

		return entity;

	}

	public Customer retrive(UUID uid) {

		Customer entity = repo.findByUid(uid).orElse(null);

		if (!entity.equals(null)) {
			return null;
		}

		return entity;

	}

	public List<Customer> getAll() {
		return repo.findAll();
	}

	public void delete(UUID uid) {

		Customer entity = repo.findByUid(uid).orElse(null);

		if (!entity.equals(null)) {
			repo.delete(entity);
		}
	}

	private Customer copyDtoToEntity(CustomerDto source, Customer target) {

		if (target == null) {
			target = new Customer();
		}

		BeanUtils.copyProperties(source, target);

		return target;
	}

	private CustomerDto copyEntityToDto(Customer source, CustomerDto target) {

		if (target == null) {
			target = new CustomerDto();
		}

		BeanUtils.copyProperties(source, target);

		return target;

	}

}
