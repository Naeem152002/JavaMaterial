/* method overriding:hum isliye karte hai ki child class ka method chal jaye .yadi aap chahate ho parent class 
ka method   chale aur child ka na chale to method overriding na kre.*/
class Animal {
	void run() {
		System.out.println("cat is running ....");
	}
}
public class Cat extends Animal{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat s= new Cat ();
s.run();
	}

}

