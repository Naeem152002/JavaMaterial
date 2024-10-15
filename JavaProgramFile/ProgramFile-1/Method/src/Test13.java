//constructor and method  ke andar default this keyword hota hai.
public class Test13 {
		Test13()
		{
			System.out.println(this);
	}
		void show () {
			System.out.println(this);
		}

	public static void main(String[] args) {
		
Test13 t=new Test13();
System.out.println(t);
t.show();

Test13 t1=new Test13();
System.out.println(t1);
t1.show();
	}

}




