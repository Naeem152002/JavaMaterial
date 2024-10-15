class Parent1{
	void show() {
		System.out.println("show of base");
	}
}

public class Child2 extends Parent1 {
void show() {
	System.out.println("show of child1");
}
void disp() {
	System.out.println("disp of child "); /* child ka normal method hum parent class ke refercne se hum call nahikr
	 hai .kyuki real world se jodo to apke andar ke gud apke papa ke andar nahi sakate lekin iska ulta ho sakata */
}
public static void main(String args[]) {
	Parent1 p=new Child2();/* upcasting-java main rule hota hai ki child class ke object ko parent class ke refe	
                             -rence main rakh sakte hai*/
	p.show();
	Child2 p1=(Child2)p;// downcasting kr de ho jayega  
	p1.disp();
}
}