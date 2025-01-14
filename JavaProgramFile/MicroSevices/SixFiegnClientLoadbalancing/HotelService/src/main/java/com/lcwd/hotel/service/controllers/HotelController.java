package com.lcwd.hotel.service.controllers;

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

import com.lcwd.hotel.service.dto.HotelDto;
import com.lcwd.hotel.service.services.HotelService;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@PostMapping("/")
	public ResponseEntity<HotelDto> createHotel(@RequestBody HotelDto hotelDto) {
		HotelDto hotel1 = this.hotelService.saveHotel(hotelDto);

		return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);

	}

	@PutMapping("/{id}")
	public ResponseEntity<HotelDto> updateHotel(@RequestBody HotelDto hotelDto,@PathVariable int id) {
		return ResponseEntity.ok(hotelService.updateHotel(hotelDto, id));

	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteHotel(@PathVariable int id) {
		hotelService.deleteHotel(id);
		return ResponseEntity.ok("Hotel Deleted Successfully");
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<HotelDto> getSingleHotel(@PathVariable int id) {
		HotelDto hotel = this.hotelService.getSingleHotel(id);
		return ResponseEntity.ok(hotel);
		
	}

	@GetMapping("/")
	public ResponseEntity<List<HotelDto>> getAllHotels() {
		List<HotelDto> allUser = this.hotelService.getAllHotels();
		return ResponseEntity.ok(allUser);

	}

}
