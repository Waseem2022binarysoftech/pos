package com.locktrust.pos.Dto;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseDto {

	private boolean isActive;

	private LocalDateTime createdAt;

	private UUID createdBy;

}
