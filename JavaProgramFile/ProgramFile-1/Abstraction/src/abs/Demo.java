package abs;
abstract class Bird{
	abstract void fly();
	abstract void eat ();
}
class Crow extends Bird{

	
	@Override
	void fly() {
	System.out.println("crow fly");
		
	}

	@Override
	void eat() {
	System.out.println("crow eat..");
		
	}
	
}
class Parrot extends Bird{

	@Override
	void fly() {
	System.out.println("Parrot fly");
		
	}

	@Override
	void eat() {
		System.out.println("Parrot eat");
		
	}
	
}
class Macaw extends Bird{


@Override
void fly() {
	System.out.println("macaw fly");
	
}

@Override
void eat() {
	System.out.println("macaw eat");
	
}
}
public class Demo{
	public static void main(String []args) {
		try {
			Class c=Class.forName(args[0]);//ise decide hoga konsi class chalana hai ye run time per decide hoga 
	        Bird bird=(Bird)c.newInstance();// upcasting
			bird.eat();
			bird.fly();
		}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
