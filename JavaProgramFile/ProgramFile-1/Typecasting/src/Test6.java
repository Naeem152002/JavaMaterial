//parametrized constructor 
class Test6 {
	String name,color ;
	int price ;
	Test6(String n,String m,int f) {
		name=n;
		color=m;
		price=f;
		
	}
	Test6(){
		
	}
	void show() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}
		public static void main(String[] args) {
Test6 t=new Test6("ram","blue ",90   );
t.show();
Test6 t1=new Test6(  );
t1.show();
		}
	

	
}

