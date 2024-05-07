package com.locktrust.pos.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto extends BaseDto {

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
