package bean;

public class UserBean {
	
	
private	String FirstName,LastName,Gender,Email,Password,Mobile;

public UserBean(String firstName, String lastName, String gender, String email, String password, String mobile) {
	super();
	FirstName = firstName;
	LastName = lastName;
	Gender = gender;
	Email = email;
	Password = password;
	Mobile = mobile;
}

public UserBean()
{
	
}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	


}
