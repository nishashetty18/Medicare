package com.medicare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedicareBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicareBackendApplication.class, args);
		System.out.println("app created");
	}

}
