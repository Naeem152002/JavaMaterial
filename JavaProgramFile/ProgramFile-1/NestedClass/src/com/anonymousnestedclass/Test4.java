package com.anonymousnestedclass;
interface I2{
	void show();
}
public class Test4 {
	public static void main(String args[]) {
		I2 i=new I2() {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("show");
			}
			
		}
		;
i.show();
	

}
}