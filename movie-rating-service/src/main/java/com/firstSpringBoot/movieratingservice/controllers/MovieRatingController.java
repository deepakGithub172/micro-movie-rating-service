package com.firstSpringBoot.movieratingservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import models.Rating;

@RestController
public class MovieRatingController {

	@Autowired
	MovieRatingService ratingService;
	
	@RequestMapping(method=RequestMethod.GET, value="/rating/{movieId}")
	public Rating getRating(@PathVariable String movieId) {
		return ratingService.getRatings(movieId);
	}
	
	@PostMapping(value ="/rating/add")
	public void addRating(@RequestBody Rating rating) {
		ratingService.addRatings(rating);
	}
	
}
 