// Second method
package encp;
import java.io.Serializable;// Serializable ko hata diya jaye ise pojo class bolate hai
public class Login1  {
 private String name,pass;
 

 public Login1(String name, String pass) {
	super();
	this.name = name;
	this.pass = pass;
}
public String getPass() {
	return pass;
}
@Override
public String toString() {
	return "Login1 [name=" + name + ", pass=" + pass + "]";
}
public void setPass(String pass) {
	this.pass = pass;
}
public void setName(String name) {
	 this.name=name;
 }
 public String getName() {
	 return name;
 }
	 
 public Login1() {
	 
 }


	}


