package com.thread.practice;

import java.util.Timer;
import java.util.TimerTask;

public class Test5 extends TimerTask{
	

	@Override
	public void run() {
		System.out.println("your recharge has expired");
		
	}
	
	public static void main(String[]args) {
		
		Timer t=new Timer();
	t.schedule(new Test5(), 5000, 5000);
		
	}

}
