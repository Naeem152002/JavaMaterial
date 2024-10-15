// java bean class 
package encp;
import java.io.Serializable;// Serializable ko hata diya jaye ise pojo class bolate hai
public class Login implements Serializable {
 private String name,pass;
 public Login(String name, String pass) {
this.setName(name);
this.setPass(pass);
 }

 public String getPass() {
	return pass;
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
 public Login () {
 }

	}


