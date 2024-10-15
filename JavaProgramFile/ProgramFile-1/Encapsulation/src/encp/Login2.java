package encp;

import java.io.Serializable;// Serializable ko hata diya jaye ise pojo class bolate hai
public class Login2 implements Serializable {
 private String name,pass;
 
public Login2 (String name2, String pass2) {
	 
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
	 
 


	}



