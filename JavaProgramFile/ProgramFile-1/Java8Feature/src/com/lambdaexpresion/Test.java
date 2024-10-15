package com.lambdaexpresion;
interface I{
	void show();
}
interface I1{
	int add(int x,int y);
}

public class Test {
	
	public static void main(String[]args) {
		
		
		I i=new I() {
			
			public void show() {
				System.out.println("show method");
			}
			
		};
		
		i.show();
		
		I i2=()->{
		System.out.println("lambda expression");	
		};
		i2.show();
		
		
		Runnable r=()->{
			System.out.println("runnable interface ");
		};
		Thread t=new Thread(r);
		t.start();
		
		
		I i3=()->System.out.println("second method lambda");
		i3.show();
		
		
		I1 i4=(x,y)->{
			return x+y;
		};
		i4.add(9, 7);
		
		I1 i5=(x,y)->(x+y);
		System.out.println(i5.add(8, 78));
	}
	
	

}
