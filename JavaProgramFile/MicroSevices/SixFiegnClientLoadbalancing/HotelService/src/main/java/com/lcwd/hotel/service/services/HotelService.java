package com.lcwd.hotel.service.services;

import java.util.List;

import com.lcwd.hotel.service.dto.HotelDto;

public interface HotelService {

	HotelDto saveHotel(HotelDto hotelDtp);

	HotelDto updateHotel(HotelDto hotelDto, int hotelId);

	void deleteHotel(int hotelId);

	HotelDto getSingleHotel(int hotelId);

	List<HotelDto> getAllHotels();

}
