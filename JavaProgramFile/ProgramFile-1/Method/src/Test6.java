
public class Test6 {
	int x=19;
	void disp() {
		System.out.println(x);
		System.out.println("disp");
	}
	Test6(){
		show();
		disp();
		System.out.println(x);
	}
	void show () {
		disp();
		System.out.println(x);
	}
	
	
	
public static void main (String sd []) {
	Test6 t=new Test6();
	System.out.println(t.x);
System.out.println(new Test6().x);
t.disp();
new Test6().disp();
t.show();
new Test6().show();
}
}
