package com.locktrust.pos.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locktrust.pos.Dto.ProductCategoryDto;
import com.locktrust.pos.Entity.ProductCategory;
import com.locktrust.pos.Repository.ProductCategoryRepository;

@Service
public class ProductCategoryService {

	@Autowired
	private ProductCategoryRepository repo;

	public ProductCategory create(ProductCategoryDto dto) {

		ProductCategory entity = copyDtoToEntity(dto, null);

		repo.save(entity);

		return entity;

	}

	public ProductCategory update(UUID uid, ProductCategoryDto dto) {

		ProductCategory entity = repo.findByUid(uid).orElse(null);

		repo.save(entity);

		return entity;

	}

	public ProductCategory retrive(UUID uid) {

		ProductCategory entity = repo.findByUid(uid).orElse(null);

		if (!entity.equals(null)) {
			return null;
		}

		return entity;

	}

	public List<ProductCategory> getAll() {
		return repo.findAll();
	}

	public void delete(UUID uid) {

		ProductCategory entity = repo.findByUid(uid).orElse(null);

		if (!entity.equals(null)) {
			repo.delete(entity);
		}
	}

	private ProductCategory copyDtoToEntity(ProductCategoryDto source, ProductCategory target) {

		if (target == null) {
			target = new ProductCategory();
		}

		BeanUtils.copyProperties(source, target);

		return target;
	}

	private ProductCategoryDto copyEntityToDto(ProductCategory source, ProductCategoryDto target) {

		if (target == null) {
			target = new ProductCategoryDto();
		}

		BeanUtils.copyProperties(source, target);

		return target;

	}

}
