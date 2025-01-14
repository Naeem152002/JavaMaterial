package com.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Rating {
	
	private String ratingId;
	
	private String userId;//micro services main direct id and restapi by the url
	
	private int hotelId;
	
	private int rating;
	
	private String feedback;
	
	private Hotel hotel;

	

	}

