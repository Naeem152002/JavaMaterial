// java bean class 
package ecp;
import java.io.Serializable;// Serializable ko hata diya jaye ise pojo class bolate hai
public class Login implements Serializable {// ye java beans class hai kyuki implements aur serializable sath
	// hai aur agar kewal implemnts krege to wo java bean nahi pojo bolate hai
	
 private String name,pass;/* ye data private hain to isko access kaise kiya jaaye get and set method ki madad 
 se access kr sakate hain ye data is class ke andar isi method se ayega aur jayega  real world main bhi aise 
 hi hota hain for example account number */
 
 public String getName() {
	 return name;
 }
 public void setName(String name) {
     this.name=name; 
 }
 public String getPass() {
	return pass;
}
public void setPass(String pass) {
this.pass = pass;
}

 public Login () {
 }

	}


