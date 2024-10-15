package com.lcwd.rating.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.rating.service.entities.Rating;

public interface RatingRepo extends JpaRepository<Rating, Integer> {

	List<Rating> findByUserId(int userId);

	List<Rating> findByHotelId(int hotelId);
}
