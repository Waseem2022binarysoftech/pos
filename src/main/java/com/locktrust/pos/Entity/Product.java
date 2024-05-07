package com.locktrust.pos.Entity;

import java.sql.Blob;

import com.locktrust.pos.Utils.Utils;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseEntity {

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

	@ManyToOne
	@JoinColumn(name = "product_category_id")
	private ProductCategory productCategory;

	@ManyToOne
	@JoinColumn(name = "product_tax_id")
	private ProductTax productTax;

}
