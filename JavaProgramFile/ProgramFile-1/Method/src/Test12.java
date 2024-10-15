
public class Test12 {
	int x=10;
	void show(int x,Test12 t) {
		//int x=20;
		System.out.println(x);
		System.out.println(t.x);
		System.out.println(t);
		System.out.println(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test12 t=new Test12();
t.show(20,t);
System.out.println(t);
	}

}




