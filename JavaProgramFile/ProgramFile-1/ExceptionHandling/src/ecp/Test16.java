package ecp;

public class Test16 {
int age;
public void validate(int a) {
	a=age;
	//this.age=age;
	if (age<18)
		throw new ArithmeticException("invalid age");
	else
		System.out.println("valid age and go for voting...");
}
public static void main(String args[]) {
	Test16 t=new Test16();
	t.validate(19);
}
}
