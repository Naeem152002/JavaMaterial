package dto;

public class Dto {
private String name,email,mobile,pass;

public Dto() {
	
}
public Dto(String name, String email, String mobile, String pass) {
	super();
	this.name = name;
	this.email = email;
	this.mobile = mobile;
	this.pass = pass;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}

}
