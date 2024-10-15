package com.withoutdi;

public class BulbService {
	
	Bulb b=new SuryaBulb();	
	
	String askForBulb() {
		return this.b.getBulb();
	}

}
