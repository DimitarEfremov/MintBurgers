package com.mintleafV2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class MintBurgers {

	public static void main(String[] args) {
		SpringApplication.run(MintBurgers.class, args);
	}

}
