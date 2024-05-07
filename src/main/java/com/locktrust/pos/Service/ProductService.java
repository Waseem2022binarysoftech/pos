package com.locktrust.pos.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locktrust.pos.Dto.ProductDto;
import com.locktrust.pos.Entity.Product;
import com.locktrust.pos.Repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;

	public Product create(ProductDto dto) {

		Product entity = copyDtoToEntity(dto, null);

		repo.save(entity);

		return entity;

	}

	public Product update(UUID uid, ProductDto dto) {

		Product entity = repo.findByUid(uid).orElse(null);
		
		entity = copyDtoToEntity(dto, entity);

		repo.save(entity);

		return entity;

	}

	public ProductDto retrive(UUID uid) {

		Product entity = repo.findByUid(uid).orElse(null);

		if (!entity.equals(null)) {
			return null;
		}
		
		ProductDto dto = copyEntityToDto(entity, null);

		return dto;

	}

	public List<Product> getAll() {
		return repo.findAll();
	}

	public void delete(UUID uid) {

		Product entity = repo.findByUid(uid).orElse(null);

		if (!entity.equals(null)) {
			repo.delete(entity);
		}
	}

	private Product copyDtoToEntity(ProductDto source, Product target) {

		if (target == null) {
			target = new Product();
		}

		BeanUtils.copyProperties(source, target);

		return target;
	}

	private ProductDto copyEntityToDto(Product source, ProductDto target) {

		if (target == null) {
			target = new ProductDto();
		}

		BeanUtils.copyProperties(source, target);

		return target;

	}

}
