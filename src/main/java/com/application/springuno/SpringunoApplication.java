package com.application.springuno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.application.springuno.repository") 
@EntityScan("com.application.springuno.entity")
@SpringBootApplication
public class SpringunoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringunoApplication.class, args);
	}

}
