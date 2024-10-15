package abs;

abstract class Bird1{
	abstract void fly1();
	abstract void eat1 ();
	abstract int eat2();
	Bird1(){// java ka rule break na ho
		System.out.println("Bird1");
	}
}
class Crow1 extends Bird1{

	@Override
	void fly1() {
	System.out.println("crow fly");
		
	}

	@Override
	void eat1() {
	System.out.println("crow eat..");
		
	}

	@Override
	int eat2() {
		// TODO Auto-generated method stub
		return 23;
	}
	
}
class Parrot1 extends Bird1{

	@Override
	void fly1() {
	System.out.println("Parrot fly");
		
	}

	@Override
	void eat1() {
		System.out.println("Parrot eat");
		
	}

	@Override
	int eat2() {
		// TODO Auto-generated method stub
		return 24;
	}
	
}
class Macaw1 extends Bird1{


@Override
void fly1() {
	System.out.println("macaw fly");
	
}

@Override
void eat1() {
	System.out.println("macaw eat");
	
}

@Override
int eat2() {
	// TODO Auto-generated method stub
	return 45;
}
}
public class Demo1{
	public static void main(String []args) {
		try {
			Class c=Class.forName(args[0]);
			Bird1 bird1=(Bird1)c.newInstance();
			bird1.eat1();
			bird1.fly1();
			int i =bird1.eat2();
		}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}

