//No parameterized cons: alag object per same data chaiye 
class Test5 {
	String name,color ;
	int price ;
	void show() {
		name="naeem";
		color="white";
		price=67;
		
	}
	void disp() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}
		public static void main(String[] args) {
		Test5 t=new Test5();
		t.show();
		t.disp();
		Test5 t1= new Test5();
		t1.show();
		t1.disp();
		}
	

	
}

