package com.dependencyconstructor;

public class Address {
	
	private String city,state,courntry;
	
	public Address(String city, String state, String courntry) {
		super();
		this.city = city;
		this.state = state;
		this.courntry = courntry;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", courntry=" + courntry + "]";
	}
	

}
