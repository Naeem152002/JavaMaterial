//datashadowing .yadi tumhe dono print krne hai to this keyword ka use kar sakete ho .
public class Test8 {
	int x=10;
	void show(int x) {
		//int x=20;
		System.out.println(x);
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test8 t=new Test8();
t.show(20);
	}

}
