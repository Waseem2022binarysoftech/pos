package com.locktrust.pos.Repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locktrust.pos.Entity.CouponCode;

@Repository
public interface CouponCodeRepository extends JpaRepository<CouponCode, Long> {
	
	Optional<CouponCode> findByUid(UUID uid);

}
