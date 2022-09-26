package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@EntityScan("com.exemple.app.model")
public class FormationArabsoftApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormationArabsoftApplication.class, args);
	}

}
