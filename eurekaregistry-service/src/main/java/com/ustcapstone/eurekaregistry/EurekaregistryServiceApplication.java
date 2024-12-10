package com.ustcapstone.eurekaregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaregistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaregistryServiceApplication.class, args);
	}

}