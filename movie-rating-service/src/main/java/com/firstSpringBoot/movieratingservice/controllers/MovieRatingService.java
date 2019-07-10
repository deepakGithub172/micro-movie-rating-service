package com.firstSpringBoot.movieratingservice.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Rating;

@Service
public class MovieRatingService {
	
	@Autowired
	private DataSource dataSource;

	@Autowired
	private RatingRepository ratingRepository;

	public List<Rating> getRatings() {
		List<Rating> ratings = new ArrayList<>();
		ratingRepository.findAll().forEach(ratings::add);
		return ratings;
	}
	
	public Rating getRatings(String movieId) {
		return ratingRepository.findById(movieId).get();
	}
	
	public void updateRatings(String movieId, int rating) {
		ratingRepository.save(new Rating(movieId, rating));
	}
	
	public void addRatings(Rating rating) {
		ratingRepository.save(rating);
	}
	
	public void deleteRatings(String movieId) {
		ratingRepository.deleteById(movieId);
	}
	
}
