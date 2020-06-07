package com.creative.solutions.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Application startup class
 * @author Team Creative
 * */
@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.creative.solutions.core"})
@EnableCaching
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
		
		System.out.print("==================================================== Core Creative Solutions Application Started Successfully ====================================================");
	}

}
