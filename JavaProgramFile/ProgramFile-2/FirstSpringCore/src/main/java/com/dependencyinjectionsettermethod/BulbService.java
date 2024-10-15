package com.dependencyinjectionsettermethod;

public class BulbService {
	

	public void setB(Bulb b) {
		this.b = b;
	}

	private Bulb b;
	
	String askForBulb() {
		return this.b.getBulb();
	}

}
