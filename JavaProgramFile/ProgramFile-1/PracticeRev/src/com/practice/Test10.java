package com.practice;

public class Test10 {
	int x=10;
	@SuppressWarnings("removal")
	public static void main(String args[]) {
		Test10 t=new Test10();
		System.out.println(t.x);
		t=null;
		System.gc();
		try {
			t.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t.x);
}
}