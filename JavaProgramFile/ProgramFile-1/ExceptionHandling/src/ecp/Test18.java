package ecp;

import java.io.IOException;

public class Test18 {
public static void main(String agrs[])throws IOException {// jis bhi method ke aage throws exception dekhe to
	// ya to try catch lagaoge ya phir us type ki exception lagaoge ye rule hota hai ye only checked exception
	//ke liye hota hai
	System.in.read();// is  method ke andar internally throws laga hai 
	/*try {
		System.in.read();// iske age throws laga hota ise handle karne ke liye try catch use karte  .
	}catch(IOException e) {// ya fir throws IOException lagao
		e.printStackTrace();
	}*/
}
}
