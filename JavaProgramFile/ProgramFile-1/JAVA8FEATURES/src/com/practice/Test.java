package com.practice;
interface I{
	void print();
}
interface I1{
	void get(String a);
}
public class Test {
	public static  int update(I i) {
		System.out.println("update");
		i.print();
		return 0;
		
	}
	public static int update (I1 i1) {
		System.out.println("this is I1");
		i1.get(null);
		return 0;
		
	}
	public static void main(String[]args) {
		
		Test.update(new I () {
			@Override
			public  void print() {
				System.out.println("how are you");
			}
		}
		
				);
		Test.update(()->{
			System.out.println("this is lambda expression");
		}
	
				
				);
		Test.update((a)->{
			System.out.println("this is lambda I1");
		});
		
	}
	
	

}
