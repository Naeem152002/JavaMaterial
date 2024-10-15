package inputoutput;

import java.beans.Transient;
import java.io.Serializable;

public class Exp implements Serializable   {
	
	transient String name;//transient ki wajah se  ye serilization mai hissa nahi leta hai
	int age;
	int id;
	static int x=5;//iska serialization nhi ho rah kyuki static ka object nahi hota hai
	Exp(String name,int age,int id){
		this.name=name;
		this.age=age;
		this.id=id;
	}
	
	

	public void show() {
	System.out.println(name);
	System.out.println(age);
	System.out.println(id);
	System.out.println(x);// TODO Auto-generated method stub

	}

}
