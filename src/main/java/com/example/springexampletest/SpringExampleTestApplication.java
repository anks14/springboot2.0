package com.example.springexampletest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringExampleTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleTestApplication.class, args);
	}
}
