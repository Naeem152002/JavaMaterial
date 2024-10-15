package com.nonstaticnestedclass;

public class Test {
int x=10;
static int y=20;
class Inner{
	int z=34;
	void show() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
public static void main(String args[]) {
	Test t=new Test();
	System.out.println(t.x);
	Test.Inner i=t.new Inner();
	i.show();
	
}
}
