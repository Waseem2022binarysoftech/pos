package com.locktrust.pos.Repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locktrust.pos.Entity.ProductTax;

@Repository
public interface ProductTaxRepository extends JpaRepository<ProductTax, Long> {

	Optional<ProductTax> findByUid(UUID uid);

}
