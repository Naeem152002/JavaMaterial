package com.exservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.entities.Hotel;


@FeignClient(url="http://localhost:8085", value="HOTEL-SERVICE")
public interface HotelClient {

	@GetMapping("/api/hotels/{id}")
	public Hotel getSingleHotel(@PathVariable int id) ;
}
