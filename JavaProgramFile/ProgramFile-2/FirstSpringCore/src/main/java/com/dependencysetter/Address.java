package com.dependencysetter;

public class Address {
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}

	private String city,state,country;

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	

}
