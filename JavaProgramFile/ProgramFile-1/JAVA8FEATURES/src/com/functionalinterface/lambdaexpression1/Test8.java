package com.functionalinterface.lambdaexpression1;


import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Test8 
{	 
	public static void main(String[] args) {
		 
		Frame frame=new Frame();
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		frame.setBackground(Color.yellow);
		Button button=new Button("click");
		frame.add(button);
		frame.setVisible(true);
		button.addActionListener((e)->System.out.println("hi"));
    	  
     
	
	}

	
}
