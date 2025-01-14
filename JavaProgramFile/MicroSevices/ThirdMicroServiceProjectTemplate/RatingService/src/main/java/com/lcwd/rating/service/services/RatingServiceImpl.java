package com.lcwd.rating.service.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.rating.service.dto.RatingDto;
import com.lcwd.rating.service.entities.Rating;
import com.lcwd.rating.service.repository.RatingRepo;

@Service
public class RatingServiceImpl implements RatingService {

	
	@Autowired
	private RatingRepo ratingRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public RatingDto saveRating(RatingDto ratingDto) {
		Rating rating=modelMapper.map(ratingDto, Rating.class);
		 Rating save=this.ratingRepo.save(rating);
		 return modelMapper.map(save, RatingDto.class);
	}

	@Override
	public RatingDto updateRating(RatingDto ratingDto, int ratingId) {
		Rating rating=ratingRepo.findById(ratingId).orElseThrow(()-> new RuntimeException("Rating not found with Id="+ratingId));
	   rating.setFeedback(ratingDto.getFeedback());
	   rating.setRating(ratingDto.getRating());
	   rating.setHotelId(ratingDto.getHotelId());
	   rating.setUserId(ratingDto.getUserId());
	   Rating save=this.ratingRepo.save(rating);
		return modelMapper.map(save, RatingDto.class);
	}
	@Override
	public void deleteRating(int ratingId) {
		Rating rating=ratingRepo.findById(ratingId).orElseThrow(()-> new RuntimeException("Rating not found with Id="+ratingId));
		ratingRepo.delete(rating);
	}
	@Override
	public RatingDto getSingleRating(int ratingId) {
		Rating rating=ratingRepo.findById(ratingId).orElseThrow(()-> new RuntimeException("Rating not found with Id="+ratingId));
		 return modelMapper.map(rating, RatingDto.class);
	}
	@Override
	public List<RatingDto> getAllRatings() {
		List<Rating>ratingList= this.ratingRepo.findAll();
		return ratingList.stream().map(rating->modelMapper.map(rating, RatingDto.class)).collect(Collectors.toList());
	}
	@Override
	public List<RatingDto> getRatingByHotelId(int hotelId) {
		List<Rating>ratingList=ratingRepo.findByHotelId(hotelId);
		return ratingList.stream().map(rating->modelMapper.map(rating, RatingDto.class)).collect(Collectors.toList());
	}

	@Override
	public List<RatingDto> getRatingByUserId(int userId) {
		List<Rating>ratingList =ratingRepo.findByUserId(userId);
		return ratingList.stream().map(rating->modelMapper.map(rating, RatingDto.class)).collect(Collectors.toList());
	}
}
