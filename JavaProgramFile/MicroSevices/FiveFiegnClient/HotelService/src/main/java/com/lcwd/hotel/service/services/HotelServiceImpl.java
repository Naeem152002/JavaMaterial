package com.lcwd.hotel.service.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.service.dto.HotelDto;
import com.lcwd.hotel.service.entities.Hotel;
import com.lcwd.hotel.service.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.service.repositories.HotelRepo;

@Service
public class HotelServiceImpl implements HotelService {
	
	
	@Autowired
	private HotelRepo hotelRepo;
	
	@Autowired
	 private ModelMapper modelMapper;

	@Override
	public HotelDto saveHotel(HotelDto hotelDto) {
		Hotel hotel=modelMapper.map(hotelDto, Hotel.class);
	      Hotel save=this.hotelRepo.save(hotel);
	      return modelMapper.map(save, HotelDto.class);
	}

	@Override
	public HotelDto updateHotel(HotelDto hotelDto,int hotelId) {
		Hotel h=hotelRepo.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("Hotel with given id is not found on server!!"+hotelId) );
		h.setName(hotelDto.getName());
		h.setLocation(hotelDto.getLocation());
		h.setAbout(hotelDto.getAbout());
		Hotel save=this.hotelRepo.save(h);
		return modelMapper.map(save, HotelDto.class);
	}

	@Override
	public void deleteHotel(int hotelId) {
		Hotel h=hotelRepo.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("Hotel with given id is not found on server!!"+hotelId) );
		hotelRepo.delete(h);
	}
	
	@Override
	public HotelDto getSingleHotel(int hotelId) {
		Hotel hotel=hotelRepo.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("Hotel with given id is not found on server!!"+hotelId) );
		return modelMapper.map(hotel, HotelDto.class);
	}

	
	@Override
	public List<HotelDto> getAllHotels() {
		 List<Hotel>hotelList=hotelRepo.findAll();
		 return  hotelList.stream().map(hotel->modelMapper.map(hotel, HotelDto.class)).collect(Collectors.toList());
		
	}

}
