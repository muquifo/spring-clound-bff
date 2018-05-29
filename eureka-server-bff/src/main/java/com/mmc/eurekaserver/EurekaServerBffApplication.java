package com.mmc.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerBffApplication.class, args);
	}
}
