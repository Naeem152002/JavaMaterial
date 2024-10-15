//Inheritance :Second method
package guiPrograming;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class GuiApp1 extends Frame {
	Frame f;
	Button b1,b2;
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	GuiApp1(String title){
		super(title);
		this.setVisible(true);
		this.setSize(400, 400);
		this.setLocation(200, 200);
		System.out.println(this.getLocation(getLocation()));
		this.setBackground(Color.red);
		b1=new Button("Add");
		b2=new Button("Sub");
		l1=new  Label("Enter First number");
		l2=new  Label("Enter Second number");
		l3=new  Label("Result");
		tf1=new  TextField(10);
		tf2=new  TextField(10);
		tf3=new  TextField(10);
		f.setLayout(new FlowLayout());
		f.add(l1);
		f.add(tf1);
		f.add(l2);
		f.add(tf2);
		f.add(l3);
		f.add(tf3);
		f.add(b1);
		f.add(b2);
	}
	public static void main(String arg[]) {
	GuiApp1 g=new GuiApp1("GuiApp");
	
}
}
