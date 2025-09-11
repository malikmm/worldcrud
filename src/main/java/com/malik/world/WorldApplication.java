package com.malik.world;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan(basePackages = {"com.malik.world.*", "com.malik.openapi.*"})
@EnableJpaRepositories(basePackages="com.malik.world.*")
@EntityScan("com.malik.openapi.*")
@Slf4j
public class WorldApplication extends SpringBootServletInitializer {
	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(WorldApplication.class, args);
		log.info("Hello World !!!");
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/countries").allowedOrigins("http://localhost:4200");
				registry.addMapping("/countries").allowedOrigins("http://localhost:3000");
			}
		};
	}
}
