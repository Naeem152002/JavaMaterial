//Panel
package guiPrograming;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class GuiApp2 {
Frame f;
Button b1,b2;
Label l1,l2,l3;
TextField tf1,tf2,tf3;
	GuiApp2(String title){
		f=new Frame(title);
		f.setVisible(true);
		f.setSize(300, 300);
		f.setLocation(150, 150);
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
       BorderLayout f1=new BorderLayout();
       f.setLayout(f1);
		l1.setBackground(Color.cyan);
		Panel p=new Panel();
		p.setBackground(Color.pink);
		f.add(p,BorderLayout.EAST);
		Panel p1=new Panel();
		p1.add(l2);
		p1.add(tf2);
		p1.setBackground(Color.green);
		f.add(p1,BorderLayout.WEST);
		
			
	}
	public static void main(String arg[]) {
	GuiApp2 t=new GuiApp2("App3");
	
}
}
