package encp;

public class Validation2 {

		public static String validate(Login login) {
			// TODO Auto-generated method stub
	if (login.getName().equals("admin")&&login.getPass().equals("admin"))// method hai.
		return "valid";
	else 
		return "invalid";
		}

	}





