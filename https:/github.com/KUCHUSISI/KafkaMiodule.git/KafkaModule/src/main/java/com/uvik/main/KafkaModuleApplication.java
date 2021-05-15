package com.uvik.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import com.uvik.service.Producer;

@EnableAutoConfiguration
@Configuration
@SpringBootApplication(scanBasePackages = "com.uvik")
public class KafkaModuleApplication {
	 
	 public static void main(String[] args) {
	        SpringApplication.run(KafkaModuleApplication.class, args);
	    }
}
