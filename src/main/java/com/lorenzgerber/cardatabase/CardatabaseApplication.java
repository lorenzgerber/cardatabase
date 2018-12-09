package com.lorenzgerber.cardatabase;

import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CardatabaseApplication {
	
	public static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

	public static void main(String[] args) {
		// After adding this comment the application is restarted		
		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("Ers ma loggn");
	}
	
	@Bean
    CommandLineRunner runner(){
      return args -> {
        // Place your code here
      };
    }
	
}
