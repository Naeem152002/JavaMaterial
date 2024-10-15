package com.withoutdi;

public class BulbService {
	
	
	Bulb bulb=new SuryaBulb();
	
	String getAsk() {
		return bulb.getBulb();
	}

}
