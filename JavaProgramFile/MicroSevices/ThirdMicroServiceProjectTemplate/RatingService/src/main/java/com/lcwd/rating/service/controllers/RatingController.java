package com.lcwd.rating.service.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.rating.service.dto.RatingDto;
import com.lcwd.rating.service.services.RatingService;


@RestController
@RequestMapping("/api/ratings")
public class RatingController {
	
	
	@Autowired
	private RatingService ratingService;
	
	@PostMapping("/")
	public ResponseEntity<RatingDto>createRating(@RequestBody RatingDto ratingDto){
		          RatingDto rating1=this.ratingService.saveRating(ratingDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
		
	}
	
	@PutMapping("/{ratingId}")
	public ResponseEntity<RatingDto>updateRating(@RequestBody RatingDto ratingDto,@PathVariable int ratingId){
		RatingDto rating1=this.ratingService.updateRating(ratingDto, ratingId);
		return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
		
	}
	@DeleteMapping("/{ratingId}")
	public ResponseEntity<?>deleteRating(@PathVariable int ratingId){
	    ratingService.deleteRating(ratingId);
		return ResponseEntity.status(HttpStatus.CREATED).body("Rating Deleted Successfully");
		
	}
	@GetMapping("/{ratingId}")
	public ResponseEntity<RatingDto>getSingleRating(@PathVariable int ratingId){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.getSingleRating(ratingId));
		
	}
	
	@GetMapping("/")
	public ResponseEntity<List<RatingDto>>getAllRating(){
		List<RatingDto>allRating=this.ratingService.getAllRatings();
		return ResponseEntity.ok(allRating);
		
	}
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<RatingDto>>getRatingByUserId(@PathVariable int userId){
		List<RatingDto>ratings=this.ratingService.getRatingByUserId(userId);
		return ResponseEntity.ok(ratings);
		
	}
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<RatingDto>>getRatingByHotelId(@PathVariable int hotelId){
		List<RatingDto>ratings=this.ratingService.getRatingByHotelId(hotelId);
		return ResponseEntity.ok(ratings);
		
	}
	

}


