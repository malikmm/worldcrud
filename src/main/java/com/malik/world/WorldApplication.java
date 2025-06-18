package com.malik.world;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = {"com.malik.world.*", "com.malik.openapi.*"})
@EnableJpaRepositories(basePackages="com.malik.world.*")
@EntityScan("com.malik.openapi.*")
//@RestController
@Slf4j
public class WorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldApplication.class, args);
		System.out.println("Hello World!!");
		log.info("Hello World !!!");
	}

//	@RequestMapping("/")
//	String home() {
//		return "Hello World!";
//	}

}
