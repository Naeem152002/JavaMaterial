package ecp;
public class Test17 {
int age;
public void validate(int age) {
	this.age=age;
	if (age<18)
		try {
		throw new ArithmeticException("invalid age");// ye internallly bhi hota hai
		}catch(Exception e) {
			System.out.println(e);
		}
	else
		System.out.println("valid age and go for voting...");
}
public static void main(String args[]) {
	Test16 t=new Test16();
	t.validate(7);
	System.out.println("normal flow....");
}


}
