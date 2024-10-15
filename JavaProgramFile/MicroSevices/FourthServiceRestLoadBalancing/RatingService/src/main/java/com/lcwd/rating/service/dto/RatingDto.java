package com.lcwd.rating.service.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RatingDto {
	

	private int ratingId;
	private int rating;
	private String feedback;
	private int userId;
	private int hotelId;
	
		

}
