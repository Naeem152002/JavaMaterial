package com.exservices;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.entities.Rating;


@FeignClient(name="RATING-SERVICE")
public interface RatingClient {

	
	@GetMapping("/api/ratings/users/{userId}")
	public List<Rating>getRatingByUserId(@PathVariable int userId);
	
}
