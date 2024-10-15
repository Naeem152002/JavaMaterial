package com.lcwd.hotel.service.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor
public class HotelDto {
	
	private int hotelId;
	private String name;
	private String location;
	private String about;

}
