package com.striker.commissioner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication(exclude = {JacksonAutoConfiguration.class})
public class CommissionerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommissionerApplication.class, args);
	}

}
