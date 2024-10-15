package com.lcwd.hotel.service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor
@Entity
public class Hotel {
	
	@Id
	private String id;
	private String name;
	private String location;
	private String about;

}
