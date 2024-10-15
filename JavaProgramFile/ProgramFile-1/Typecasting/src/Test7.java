// Non parametized method :alag alag object per same data assign karan ho
class Test7 {
	String name,color ;
	int price ;
	void disp() {
		name="ram";
		color="yellow";
		price=90;
		
	}
	void show() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}
		public static void main(String[] args) {
Test7 t=new Test7();
t.disp();
t.show();
Test7 t1=new Test7( );
t1.disp();
t1.show();
		}
	

	
}


