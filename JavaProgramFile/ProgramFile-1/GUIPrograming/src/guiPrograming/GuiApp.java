//Associtation :First method
package guiPrograming;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class GuiApp {
Frame f;
Button b1,b2;
Label l1,l2,l3;
TextField tf1,tf2,tf3;
	GuiApp(String title){
		f=new Frame(title);
		f.setVisible(true);
		f.setSize(500, 500);
		f.setLocation(250, 250);
		System.out.println(f.getLocation());
		f.setBackground(Color.yellow);
		b1=new Button("Add");
		b2=new Button("Sub");
		l1=new  Label("Enter First number");
		l2=new  Label("Enter Second number");
		l3=new  Label("Result");
		tf1=new  TextField(10);
		tf2=new  TextField(10);
		tf3=new  TextField(10);
       // f.setLayout(new FlowLayout());
		f.setLayout(null);// kuch nahi dikhaga
		/*l1.setBackground(Color.blue);
		l1.setBounds(30, 50, 120, 50);
		tf1.setBounds(100, 50, 120, 50);*/
		//FlowLayout f1=new FlowLayout(FlowLayout.LEFT);
		//FlowLayout f1=new FlowLayout(FlowLayout.CENTER,40,40);// ye sab ek karake use karna hai need per 
		//GridLayout f1=new GridLayout(4,4);
		BorderLayout f1=new BorderLayout();
		f.add(l1,BorderLayout.EAST);
		f.add(tf1,BorderLayout.WEST);
		f.setLayout(f1);
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
	GuiApp t=new GuiApp("App");
	
}
}
