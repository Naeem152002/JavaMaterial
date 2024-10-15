package com.lcwd.rating.service.services;

import java.util.List;

import com.lcwd.rating.service.dto.RatingDto;

public interface RatingService {
	RatingDto saveRating(RatingDto ratingDto);
	
	RatingDto updateRating(RatingDto ratingDto,int ratingId);
	
	void deleteRating(int ratingId);

	RatingDto getSingleRating(int ratingId);
	
	List<RatingDto> getAllRatings();

	List<RatingDto> getRatingByUserId(int userId);

	List<RatingDto> getRatingByHotelId(int hotelId);

}
