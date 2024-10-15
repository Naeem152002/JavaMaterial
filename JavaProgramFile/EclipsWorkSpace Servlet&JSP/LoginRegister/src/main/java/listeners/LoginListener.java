package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.UserDao;
import ui.LoginUi;
import ui.RegisterUi;
import ui.WelcomeUi;

public class LoginListener implements ActionListener{
	LoginUi loginUi;
	public LoginListener(LoginUi loginUi) {
		// TODO Auto-generated constructor stub
		this.loginUi=loginUi;
	}
	String email,pass;
	WelcomeUi welcomeUi;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(loginUi.login)) {
			email=loginUi.email.getText();
			pass=loginUi.pass.getText();
			UserDao.loginDao(email, pass);
		}
		else if(e.getSource().equals(loginUi.register)) {
			new RegisterUi();
		}
	}

}
