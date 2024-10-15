
package com.lambdaexpression;
interface I{
	public void show();
}
interface I1{
	public String say();
}
interface I2{
	public String say(String name);
}

public class Test {
	
	public static void main(String[]ars) {
		I i=()->{
			System.out.println("how are you I am good");
		};
		i.show();
	
	I1 i1=()->{
		return "hello";
	};
	System.out.println(i1.say());
	
	I2 i2=(name)->{
		return"hello"+name;
	};
System.out.println(i2.say(null));
}
}