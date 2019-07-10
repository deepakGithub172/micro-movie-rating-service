package com.firstSpringBoot.movieratingservice.controllers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Rating;

@Repository
public interface RatingRepository extends CrudRepository<Rating, String> {

}
