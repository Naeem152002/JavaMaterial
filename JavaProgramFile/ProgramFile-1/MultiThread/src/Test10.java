//yaha se notepad open kr sakate hai
import java.io.IOException;

class Child1 extends Thread{
	public void run() {
		System.out.println("hi");// ye task chal jayega
	}
}
public class Test10{
	public static void main(String args[]) {
		
	Runtime runtime=Runtime.getRuntime();
	try {
		runtime.exec("notepad.exe");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
Child1 child =new Child1();
	//Runtime runtime=Runtime.getRuntime();//getRuntime() method runtime ka object deta hai or jvm ka object
	//runtime.addShutdownHook(child);//ye method hai
System.exit(0);
	try {
		Thread.sleep(10000);
		}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	child.start();

	
	
	
	
	}
}

