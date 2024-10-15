package com.withoutlambda;
interface I{
	public void show();
}


public class Test {
	public static void main(String[]args) {
		
		
		I i=new I() {
		public void show() {
			System.out.println("how are you");
		}
			
		};
		i.show();
		
	}

}