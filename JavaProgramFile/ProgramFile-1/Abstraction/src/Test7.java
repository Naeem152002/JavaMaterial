
 class Devid {
	    Devid(){
	        System.out.println("Abstract class :Demo Constructor");
	    }
	}
	public class Test7 extends Devid{
	    Test7(){
	       // super();// nahi lagaao ge to hota hai abstract class ka  constructor call hota super ki wajah se  
	        System.out.println("Normal class constructor");
	    }
	public static void main(String[] args) {
	    new Test7();
	   } 


	}  



