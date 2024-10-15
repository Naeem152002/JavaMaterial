package com.withdi;

public class BulbService {
	
	public Bulb getBulb() {
		return bulb;
	}

	public void setBulb(Bulb bulb) {
		this.bulb = bulb;
	}

	Bulb bulb;
	
	public String getAsk() {
		return bulb.getBulb();
	}

}
