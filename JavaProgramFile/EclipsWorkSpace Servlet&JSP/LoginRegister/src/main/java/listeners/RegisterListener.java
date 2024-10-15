package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.UserDao;
import dto.Dto;
import ui.LoginUi;
import ui.RegisterUi;
import validation.Validation;

public class RegisterListener implements ActionListener {
	RegisterUi registerUi;
	public RegisterListener() {
		// TODO Auto-generated constructor stub
	}
	public RegisterListener(RegisterUi registerUi) {
		// TODO Auto-generated constructor stub
		this.registerUi=registerUi;
	}
	Dto dto=new Dto();
	LoginUi loginUi;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(registerUi.register)) {
			String name=registerUi.name.getText();
			String mobile=registerUi.mobile.getText();
			String email=registerUi.email.getText();
			String pass=registerUi.pass.getText();
			boolean b=new Validation().validate(name,email,mobile,pass);
			if (b) {
					dto.setEmail(email);
					dto.setMobile(mobile);
					dto.setName(name);
					dto.setPass(pass);
					UserDao.registerDao(dto);
				JOptionPane.showMessageDialog(new JOptionPane(), "Successfully Registered");
			}
			else {
				JOptionPane.showMessageDialog(new JOptionPane(), "Invalid details");
			}
			}
			else if (e.getSource().equals(registerUi.login)) {
				loginUi=new LoginUi();
			}
	}

}
