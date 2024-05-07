package com.locktrust.pos.Dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCategoryDto extends BaseDto {

	private String name;

	private String description;

	private ProductCategoryDto parent;

	private List<ProductDto> product;

}
