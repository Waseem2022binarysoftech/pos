package com.locktrust.pos.Repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locktrust.pos.Entity.Product;
import com.locktrust.pos.Entity.ProductCategory;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	Optional<Product> findByUid(UUID uid);

}
