  // copy constructor 
package constructor;

public class Test6 {
	String name;
	int age;
	Test6(String n,int a){
name=n;
age=a;
	}
	Test6(Test6 t){// first method
		name=t.name;
		age=t.age;
	}
	
void show(){
	System.out.println(name);
	System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test6 t=new Test6("ram",23);
t.show();
Test6 t1=new Test6(t);
t1.show();
// second method
/*t1.name=t.name;
t1.age=t.age;
*/
	}

}
