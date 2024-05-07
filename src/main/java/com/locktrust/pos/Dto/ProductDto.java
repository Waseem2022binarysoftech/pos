package com.locktrust.pos.Dto;

import java.sql.Blob;

import com.locktrust.pos.Entity.ProductCategory;
import com.locktrust.pos.Entity.ProductTax;
import com.locktrust.pos.Utils.Utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto extends BaseDto {

	private String name;

	private String description;

	private Blob imageUrl;

	private Utils.ProductType productType;

	private String plu;

	private String gtin;

	private String price;

	private boolean visible;

	private String posProductId;

	private String[] posCategoryIds;

	private Integer deliveryTax;

	private Integer takeawayTax;

	private Integer eatInTax;

	private Integer min;

	private Integer max;

	private Integer defaultQuantity;

	private String categoryName;

	private String categoryId;
	
	private ProductCategoryDto productCategory;
	
	private ProductTaxDto productTax;

}
