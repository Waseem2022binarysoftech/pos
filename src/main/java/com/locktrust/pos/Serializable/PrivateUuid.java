package com.locktrust.pos.Serializable;

import java.io.Serializable;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;

@Embeddable
public class PrivateUuid implements Serializable {

	@GeneratedValue(generator = "uuid4")
	@GenericGenerator(name = "uuid4", strategy = "uuid2")
	@Column(columnDefinition = "BINARY(16)")
	private UUID uid;

}
