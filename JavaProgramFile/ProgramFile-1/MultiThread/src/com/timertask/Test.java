// ye har 5 second ke main ek task banake dega wo bhi frame:task schudling
package com.timertask;
import java.awt.Frame;
import java.util.Timer;
import java.util.TimerTask;
class Mytask extends TimerTask{
	public void run() {//iske andar koi task krwana hai
		System.out.println("hello");
		
	}
}
public class Test {

	public static void main(String[] args) {
		
		Timer t=new Timer();
		t.scheduleAtFixedRate(new Mytask(), 10000,500);
		
		
		// TODO Auto-generated method stub

	}

}
