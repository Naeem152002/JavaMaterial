package com.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.UserDto;
import com.entities.Rating;
import com.entities.User;
import com.excetpions.ResourceNotFoundException;
import com.exservices.HotelClient;
import com.exservices.RatingClient;
import com.repo.UserRepo;


@Service
public class UserServiceImpl implements UserService{
	

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	RatingClient ratingClient;

	
	@Autowired
	private HotelClient hotelClient;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDto saveUser(UserDto userDto) {
		User user1=modelMapper.map(userDto, User.class);
		User user=userRepo.save(user1);
		List<Rating>listRating=ratingClient.getRatingByUserId(user.getUserId());
		List<Rating>newListRating=listRating.stream().map(rating->{
			rating.setHotel(hotelClient.getSingleHotel(rating.getHotelId()));
			return rating;
		}).collect(Collectors.toList());
		user.setRatings(newListRating);
		return modelMapper.map(user, UserDto.class);
	}



	@Override
	public UserDto updateUser(UserDto userDto, int userId) {
		User u=userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id is not found on server!!"+userId) );
		u.setName(userDto.getName());
		u.setEmail(u.getEmail());
		u.setAbout(userDto.getAbout());
		List<Rating>listRating=ratingClient.getRatingByUserId(u.getUserId());
		List<Rating>newListRating=listRating.stream().map(rating->{
			rating.setHotel(hotelClient.getSingleHotel(rating.getHotelId()));
			return rating;
		}).collect(Collectors.toList());
		u.setRatings(newListRating);
		User user=userRepo.save(u);
		return modelMapper.map(user, UserDto.class);
	}



	@Override
	public void deleteUser(int userId) {
		User u=userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id is not found on server!!"+userId) );
		userRepo.delete(u);
	}

	@Override
	public UserDto getSingleUser(int userId) { 
	User user=userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id is not found on server!!"+userId) );
	List<Rating>listRating=ratingClient.getRatingByUserId(user.getUserId());
	List<Rating>newListRating=listRating.stream().map(rating->{
		rating.setHotel(hotelClient.getSingleHotel(rating.getHotelId()));
		return rating;
	}).collect(Collectors.toList());
	user.setRatings(newListRating);
	return modelMapper.map(user, UserDto.class);
	}

	@Override
	public List<UserDto> getAllUsers() {
		List<User>listUsers=userRepo.findAll();
		List<User>newListUsers=listUsers.stream().map(user->{
			List<Rating>ratings=ratingClient.getRatingByUserId(user.getUserId());
			List<Rating>newRatingList=ratings.stream().map(rating->{
				rating.setHotel(hotelClient.getSingleHotel(rating.getHotelId()));
				return rating;
			}).collect(Collectors.toList());
			user.setRatings(newRatingList);
			return user;
		}).collect(Collectors.toList());
		
		return newListUsers.stream().map(user->modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
	}
	
}
