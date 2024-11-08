package com.ustcapstone.goalservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GoalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoalServiceApplication.class, args);
	}

}
