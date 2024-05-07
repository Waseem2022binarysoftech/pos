package com.locktrust.pos.Entity;

import java.time.LocalDateTime;

import com.locktrust.pos.Utils.Utils;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class CouponCode extends BaseEntity {

	private String couponCode;

	private Utils.CouponType couponType;

	private Utils.CouponBasedOn couponBasedOn;

	private Integer couponQuantity;

	private Double couponValue;

	private LocalDateTime startingDate;

	private LocalDateTime expiryDate;

}
