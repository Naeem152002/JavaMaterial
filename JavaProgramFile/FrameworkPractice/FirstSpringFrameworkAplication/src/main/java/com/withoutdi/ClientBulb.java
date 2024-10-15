package com.withoutdi;

public class ClientBulb {
	
	public static  void main(String[]args) {
		BulbService bs=new BulbService();
		
		System.out.println(bs.getAsk());
	}

}
