package guiPrograming;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class GuiApp6 extends Frame {
Frame f;
Button b,b1;
Label l1,l2,l3;
TextField tf1,tf2,tf3;
	GuiApp6(String title){
		f=new Frame(title);
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(250, 250);
	
		System.out.println(this.getLocation());
		this.setBackground(Color.yellow);
		b=new Button("Div");
		b1=new Button("Mul");
		l1=new  Label("Enter First number");
		l2=new  Label("Enter Second number");
		l3=new  Label("Result");
		tf1=new  TextField(10);
		tf2=new  TextField(10);
		tf3=new  TextField(10); 
		FlowLayout f1=new FlowLayout();
		this.setLayout(f1);
	
        this.add(l1);
		this.add(tf1);
		this.add(l2);
		this.add(tf2);
		this.add(l3);
		this.add(tf3);
		this.add(b);
		this.add(b1);
	
		OuterClass2 s=new OuterClass2(this);
		b.addActionListener(s);
		b1.addActionListener(s);
	}
	public static void main(String arg[]) {
	GuiApp6 t=new GuiApp6("App");
	
}
}
