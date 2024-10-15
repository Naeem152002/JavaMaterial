//Outerclass1 constructor pass karne ka second method hai
package guiPrograming;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class MyGuiApp3 extends Frame  {/*jisme apne gui ki conding ki hai usmelistner
interface ko implemnets kr do MyGuiApp listner class kahlayegi kyuki ye listner intetface ko implements kr 
rahi hai*/
	Frame f;
	Button b,b1;
	TextField tf;
	MyGuiApp3(String s){
		super(s);
		this.setVisible(true);
		this.setSize(400,400);
		this.setLayout(new FlowLayout());
		b=new Button("ok");
		this.setBackground(Color.yellow);
		//button hamari b hai  
		this.add(b);
		b1=new Button("cancle");
	                           //button hamari b hai  
		this.add(b1);
		tf=new TextField(20);
		this.add(tf);
		OuterClass1 d=new OuterClass1(b, tf);
		b.addActionListener(d);
		b1.addActionListener(d);
	}
	
		
	public static void main(String[] args) {
MyGuiApp3 g=new MyGuiApp3("apple");
		// TODO Auto-generated method stub

	}

}
