//Multithread:intheritance
class Thread1 extends Thread{
	public Thread1(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	public void run() {
	Logic.printTable(3);	
}
}
class Thread2 extends Thread1{
	public Thread2(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	public void run() {
		Logic.printTable(2);	
	}
}

class  Thread3 extends Thread2{
	public Thread3(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	public void run() {
		Logic.checkevenodd(4);	
}
}

public class Test {

	public static void main(String[] args) throws Exception {// yaha iski wajah se try catch nahi lagaya hai
		// TODO Auto-generated method stub
Thread1 t1= new Thread1("one");
Thread2 t2= new Thread2("two");
Thread3 t3= new Thread3("one");
t1.start();
Thread.sleep(5000);
t2.start();
Thread.sleep(5000);
t3.start();
}

}
class Logic {
	static public void printTable(int x) {
		 for(int i=0;i<=10;i++) 
			System.out.println(i*x);	
	}
	public static void checkevenodd(int x) {
		if(x%2==0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
	}
}
