package com.locktrust.pos;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class PosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosApplication.class, args);
	}

	@PostConstruct
	public void init() {

		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

	}

}
