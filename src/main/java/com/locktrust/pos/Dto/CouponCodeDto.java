package com.locktrust.pos.Dto;

import java.time.LocalDateTime;

import com.locktrust.pos.Utils.Utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CouponCodeDto extends BaseDto {

	private String couponCode;

	private Utils.CouponType couponType;

	private Utils.CouponBasedOn couponBasedOn;

	private Integer couponQuantity;
	
	private Double couponValue;
	
	private LocalDateTime startingDate;
	
	private LocalDateTime expiryDate;

}
