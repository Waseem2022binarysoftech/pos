package com.locktrust.pos.Exception;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String errorCode;

	private Object errorMessage;
}
