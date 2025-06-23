package com.malik.world;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.malik.world.*", "com.malik.openapi.*"})
@EnableJpaRepositories(basePackages="com.malik.world.*")
@EntityScan("com.malik.openapi.*")
@Slf4j
public class WorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldApplication.class, args);
		log.info("Hello World !!!");
	}
}
