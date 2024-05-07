package com.locktrust.pos.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends BaseEntity {

	private String firstName;
	
	private String LastName;
	
	private String phoneNumber;
	
	private String emailAddress;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String zip;

}
