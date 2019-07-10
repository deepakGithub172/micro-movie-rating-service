package com.firstSpringBoot.movieratingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.firstSpringBoot.movieratingservice.controllers")
@SpringBootApplication
public class MovieRatingServiceApplication {

	/*	@Bean
	public MovieRatingService getRatingService() {
		return new MovieRatingService();
	}*/

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingServiceApplication.class, args);
	}

}
