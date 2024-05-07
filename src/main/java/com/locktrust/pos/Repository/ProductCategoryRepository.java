package com.locktrust.pos.Repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locktrust.pos.Entity.Customer;
import com.locktrust.pos.Entity.ProductCategory;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
	
	Optional<ProductCategory> findByUid(UUID uid);

}
