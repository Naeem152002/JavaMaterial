package com.dibycondependentobject;

public class Address {
	private String city,state,country;

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public Address() {
		super();
	}

}
