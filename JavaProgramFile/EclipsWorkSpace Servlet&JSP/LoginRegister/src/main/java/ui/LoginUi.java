package ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;

import listeners.LoginListener;

public class LoginUi {
		public TextField email;
		public TextField pass;
		public JFrame frame;
		Label e,p;
		public Button login;
		public Button register;
			public LoginUi(){
			frame=new JFrame("Login");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(220, 400);
			e=new Label("Enter Email");
			p=new Label("Enter Pass");
			email=new TextField(10);
			pass=new TextField(10);
			login=new Button("Login");
			register=new Button("Register");
			login.addActionListener(new LoginListener(this));
			register.addActionListener(new LoginListener(this));
			frame.setLayout(new  FlowLayout());
			frame.add(e);
			frame.add(email);
			frame.add(p);
			frame.add(pass);
			frame.add(login);
			frame.add(register);
			frame.setVisible(true);
			}
			
}
