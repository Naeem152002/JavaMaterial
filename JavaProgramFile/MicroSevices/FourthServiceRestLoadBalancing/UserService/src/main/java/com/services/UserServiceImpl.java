package com.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dto.UserDto;
import com.entities.Hotel;
import com.entities.Rating;
import com.entities.User;
import com.excetpions.ResourceNotFoundException;
import com.repo.UserRepo;


@Service
public class UserServiceImpl implements UserService{
	

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private RestTemplate restTemplate;
	

	private Logger logger=LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDto saveUser(UserDto userDto) {
		User user1=modelMapper.map(userDto, User.class);
		User user=userRepo.save(user1);
		Rating[] ratingsOfUser=restTemplate.getForObject("http://RATING-SERVICE/api/ratings/users/"+user.getUserId(),Rating[].class);
	     logger.info("{}",ratingsOfUser);
	     List<Rating>ratings=Arrays.stream(ratingsOfUser).toList();
	     List<Rating>newRatingList=ratings.stream().map(rating -> {
	    		
	    		ResponseEntity<Hotel> forEntity=restTemplate.getForEntity("http://HOTEL-SERVICE/api/hotels/"+rating.getHotelId(), Hotel.class);
	    	              Hotel hotel=forEntity.getBody();
	    			logger.info("response status code:{}",forEntity.getStatusCode());
	    			rating.setHotel(hotel);
	    		return rating;
	    		}).collect(Collectors.toList())	;
	    		
	     user.setRatings(newRatingList);
		return modelMapper.map(user, UserDto.class);
	}



	@Override
	public UserDto updateUser(UserDto userDto, int userId) {
		User u=userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id is not found on server!!"+userId) );
		u.setName(userDto.getName());
		u.setEmail(u.getEmail());
		u.setAbout(userDto.getAbout());
		Rating[] ratingsOfUser=restTemplate.getForObject("http://RATING-SERVICE/api/ratings/users/"+u.getUserId(),Rating[].class);
	     logger.info("{}",ratingsOfUser);
	     List<Rating>ratings=Arrays.stream(ratingsOfUser).toList();
	     List<Rating>newRatingList=ratings.stream().map(rating -> {
	    		
	    		ResponseEntity<Hotel> forEntity=restTemplate.getForEntity("http://HOTEL-SERVICE/api/hotels/"+rating.getHotelId(), Hotel.class);
	    	              Hotel hotel=forEntity.getBody();
	    			logger.info("response status code:{}",forEntity.getStatusCode());
	    			rating.setHotel(hotel);
	    		return rating;
	    		}).collect(Collectors.toList())	;
	    		
	     u.setRatings(newRatingList);
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
	Rating[] ratingsOfUser=restTemplate.getForObject("http://RATING-SERVICE/api/ratings/users/"+user.getUserId(),Rating[].class);
     logger.info("{}",ratingsOfUser);	
	List<Rating>ratings=Arrays.stream(ratingsOfUser).toList();

	List<Rating>newRatingList=ratings.stream().map(rating -> {
	
	ResponseEntity<Hotel> forEntity=restTemplate.getForEntity("http://HOTEL-SERVICE/api/hotels/"+rating.getHotelId(), Hotel.class);
              Hotel hotel=forEntity.getBody();
		logger.info("response status code:{}",forEntity.getStatusCode());
		rating.setHotel(hotel);
	return rating;
	}).collect(Collectors.toList())	;
	
	user.setRatings(newRatingList);
	
	
	return modelMapper.map(user, UserDto.class);
	}

	@Override
	public List<UserDto> getAllUsers() {
		List<User>listUsers=userRepo.findAll();
		List<User>newListUsers=listUsers.stream().map(user->{
			Rating[] ratingsOfUser=restTemplate.getForObject("http://RATING-SERVICE/api/ratings/users/"+user.getUserId(),Rating[].class);
		     logger.info("{}",ratingsOfUser);
		     List<Rating>ratings=Arrays.stream(ratingsOfUser).toList();
		     List<Rating>newRatingList=ratings.stream().map(rating -> {
		    		
		    		ResponseEntity<Hotel> forEntity=restTemplate.getForEntity("http://HOTEL-SERVICE/api/hotels/"+rating.getHotelId(), Hotel.class);
		    	              Hotel hotel=forEntity.getBody();
		    			logger.info("response status code:{}",forEntity.getStatusCode());
		    			rating.setHotel(hotel);
		    		return rating;
		    		}).collect(Collectors.toList())	;
		    		
		     user.setRatings(newRatingList);
			return user;
		}).collect(Collectors.toList());

		return newListUsers.stream().map(user->modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
	}
	
//	List<Rating> ratingsOfUser=restTemplate.getForObject("http://localhost:8086/api/ratings/users/"+u.getUserId(),List.class);
//    logger.info("{}",ratingsOfUser);
//    u.setRatings(ratingsOfUser);
	//ye logic sahi but yaha per kya ho raha yaha per humne list to ban di hain rating but jo object hain linked hashmap ke form rakh diya  hain
	// isliye yaha per  jo neeche hum map laga rahe hainn wo use hashmapp samaj raha hain rating nahi samaj pa raha hain
//conclusion ye hain list bana gaya hain but jo object hain list ke pass use hashmap samaj raha hain rating nahi samaj raha hain
}
