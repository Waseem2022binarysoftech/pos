package com.locktrust.pos.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProductTax extends BaseEntity {

	private String taxName;

	private Integer taxType;

	private Float taxValue;

	@OneToMany(mappedBy = "id")
	private List<Product> product;

}
