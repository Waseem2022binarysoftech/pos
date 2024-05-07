package com.locktrust.pos.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProductCategory extends BaseEntity {

	@NotBlank
	private String name;

	private String description;

	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(nullable = true)
	private ProductCategory parent;

	@OneToMany(mappedBy = "id")
	private List<Product> product;

}
