/* method overriding:hum isliye karte hai ki child class ka method chal jaye .yadi aap chahate ho parent class 
ka method  na chale aur child ka na chale to method overriding na kre.*/
class Vehichale {
	void run() {

		System.out.println("vehichale is running ....");
}
}
 class Bike1 extends Vehichale{
void run() {
	super.run();
	System.out.println("bike1 is running..");
}
 }
public class Hero extends Bike1{
	void run() {
		super .run();
		System.out.println("hero is runnig ...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hero t= new Hero ();
t.run();
	}

}
 
