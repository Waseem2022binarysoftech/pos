package com.locktrust.pos.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locktrust.pos.Dto.ProductTaxDto;
import com.locktrust.pos.Entity.ProductTax;
import com.locktrust.pos.Repository.ProductTaxRepository;

@Service
public class ProductTaxService {
	
	@Autowired
	private ProductTaxRepository repo;

	public ProductTax create(ProductTaxDto dto) {

		ProductTax entity = copyDtoToEntity(dto, null);

		repo.save(entity);

		return entity;

	}

	public ProductTax update(UUID uid, ProductTaxDto dto) {

		ProductTax entity = repo.findByUid(uid).orElse(null);

		repo.save(entity);

		return entity;

	}

	public ProductTax retrive(UUID uid) {

		ProductTax entity = repo.findByUid(uid).orElse(null);

		if (!entity.equals(null)) {
			return null;
		}

		return entity;

	}

	public List<ProductTax> getAll() {
		return repo.findAll();
	}

	public void delete(UUID uid) {

		ProductTax entity = repo.findByUid(uid).orElse(null);

		if (!entity.equals(null)) {
			repo.delete(entity);
		}
	}

	private ProductTax copyDtoToEntity(ProductTaxDto source, ProductTax target) {

		if (target == null) {
			target = new ProductTax();
		}

		BeanUtils.copyProperties(source, target);

		return target;
	}

	private ProductTaxDto copyEntityToDto(ProductTax source, ProductTaxDto target) {

		if (target == null) {
			target = new ProductTaxDto();
		}

		BeanUtils.copyProperties(source, target);

		return target;

	}

}
