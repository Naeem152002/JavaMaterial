package validation;

public class Validation {
	public boolean validate(String name,String email,String mobile,String pass) {
		if (name==null || !email.endsWith(".com") || mobile.length()!=10 || pass==null) {
			return false;
		}
		else
			return true;
	}
	public boolean validateLogin(String email,String pass) {
		if (!email.endsWith(".com") || pass==null) {
			return false;
		}
		else
			return true;
	}
}
