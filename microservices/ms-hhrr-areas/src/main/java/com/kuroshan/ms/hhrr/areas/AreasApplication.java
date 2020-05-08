package com.kuroshan.ms.hhrr.areas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AreasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AreasApplication.class, args);
	}

}
