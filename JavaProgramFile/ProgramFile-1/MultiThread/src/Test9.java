import java.io.IOException;  
class Child extends Thread{
	public void run() {
		System.out.println("hi");// ye task chal jayega
	}
}
public class Test9{
	public static void main(String args[]) {
	Child child =new Child();
	Runtime runtime=Runtime.getRuntime();//getRuntime() method runtime ka object deta hai or jvm ka object
	runtime.addShutdownHook(child);//ye method hai
	try {
		Thread.sleep(1000);
		}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	//child.start();	
	}
}
