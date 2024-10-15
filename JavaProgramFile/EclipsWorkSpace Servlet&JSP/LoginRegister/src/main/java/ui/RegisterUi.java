package ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;

import listeners.RegisterListener;

public class RegisterUi {
		public TextField name;
		public TextField email;
		public TextField mobile;
		public TextField pass;
		JFrame frame;
		Label n,e,m,p;
		public Button register;
		public Button login;
			public RegisterUi(){
			frame=new JFrame("Register");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(220, 400);
			n=new Label("Enter Name");
			e=new Label("Enter Email");
			m=new Label("Enter Mobile");
			p=new Label("Enter Pass");
			name=new TextField(10);
			email=new TextField(10);
			mobile=new TextField(10);
			pass=new TextField(10);
			register=new Button("Register");
			login=new Button("Login");
			register.addActionListener(new RegisterListener(this));
			login.addActionListener(new RegisterListener(this));
			frame.setLayout(new  FlowLayout());
			frame.add(n);
			frame.add(name);
			frame.add(e);
			frame.add(email);
			frame.add(m);
			frame.add(mobile);
			frame.add(p);
			frame.add(pass);
			frame.add(register);
			frame.add(login);
			frame.setVisible(true);	
			}
			
}
