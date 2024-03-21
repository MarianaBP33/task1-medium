package com.mariana.task2medium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @EntityScan(basePackages = { "com.mariana.model" })
// @ComponentScan(basePackages = { "com.mariana.controller",
// "com.mariana.service" })
public class Task2MediumApplication {

	public static void main(String[] args) {
		SpringApplication.run(Task2MediumApplication.class, args);
	}

}
