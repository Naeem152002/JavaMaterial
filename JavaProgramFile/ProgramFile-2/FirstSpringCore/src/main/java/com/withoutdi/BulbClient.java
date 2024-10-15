package com.withoutdi;

public class BulbClient {
	
	public static void main(String[]args) {
		
		BulbService bulb=new BulbService();
	System.out.println(bulb.askForBulb());
	}

}
