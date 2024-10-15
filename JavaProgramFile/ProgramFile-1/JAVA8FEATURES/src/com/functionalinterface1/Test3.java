package com.functionalinterface1;


import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 implements ActionListener  
{	 
	public static void main(String[] args) 
	{
		Frame frame=new Frame();
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		frame.setBackground(Color.yellow);
		Button button=new Button("click");
		frame.add(button);
		frame.setVisible(true);
		button.addActionListener(new Test3());
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("clcok");
	}
 

	
	
}

