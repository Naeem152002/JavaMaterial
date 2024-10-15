//parameteriezed method : alag object per alag data chaiye
public class Test4 {
	String name,color ;
	int price ;

	void disp() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}
	void show(String n,String m,int f) {
		name=n;
		color=m;
		price=f;
		
	}
		public static void main(String[] args) {
		Test4 t=new Test4();
		t.show("ram","blue ",90);
        t.disp();
        Test4 t1= new Test4();
        t1.show("rahul","yellow",89);
        t1.disp();
		}
	

	
}
