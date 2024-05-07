package com.locktrust.pos.Entity;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@MappedSuperclass
public abstract class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private UUID uid;

	private boolean isActive = true;

	@CreationTimestamp
	private LocalDateTime createdAt;

	private UUID createdBy;

	public BaseEntity() {
		super();
		this.uid = UUID.randomUUID();
	}

}
