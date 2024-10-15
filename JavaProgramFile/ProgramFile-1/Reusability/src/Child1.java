/* ye exmple run time polymorphisam ka hai.method ovveriding and upcasting dono hai isliye
jab method ko call karate to ye call parent class ka hota hai lekin output humko child class ka milta kyuki
jab app method ko call karate ho chuki p variable ka type Parent to ye parent main jaake serch karata hai
 method hai ki nahi ye compile time per check karata hai lekin p variable main object jis type ka wo jvm run 
time per check karata aur dekhata hai ki method overriding kar raha hai kr raha to wo child ka print kar deta 
nahi override hoga to waha waha parent ke krega .jab ovveride hota to call parent ka hota hai aur run child ka 
hota hai .ise dynamic dispatch bhi kahate */
class Parent{
	void show() {
		System.out.println("show of base");
	}
}

public class Child1 extends Parent {
void show() {
	System.out.println("show of child1");
}
public static void main(String args[]) {
	Parent p=new Child1();/* upcasting-java main rule hota hai ki child class ke object ko parent class ke refe	
    //Parent p =new  Parent();                        // -rence main rakh sakte hai*/
	p.show();
}
}
