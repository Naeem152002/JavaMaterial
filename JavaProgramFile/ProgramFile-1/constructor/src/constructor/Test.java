package constructor;
public class Test {
String name;
int age;
 Test(String n,int a){
name=n;
 age=a;
 }
//Test(){}
 void show() {
	
	System.out.println(name);
	System.out.println(age);
}
public static void main(String[] args) {
		
		Test t = new Test("naeem",34);
		t.show();
	Test t1=new Test("jeeshan",356);
	t1.show();
	}

}
// yah per local wala jo data asign hua 
