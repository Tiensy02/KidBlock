package com.javaSpring.KidBlock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling 
public class KidBlockApplication {

	public static void main(String[] args) { 
		SpringApplication.run(KidBlockApplication.class, args);
	}

}
