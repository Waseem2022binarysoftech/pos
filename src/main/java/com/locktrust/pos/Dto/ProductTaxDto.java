package com.locktrust.pos.Dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductTaxDto extends BaseDto {

	private String taxName;

	private Integer taxType;

	private Float taxValue;

	private List<ProductDto> product;

}
