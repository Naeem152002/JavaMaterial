
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

public class GuiApp5 extends Frame implements ActionListener{
Frame f;
Button b,b1;
Label l1,l2,l3;
TextField tf1,tf2,tf3;
	GuiApp5(String title){
		f=new Frame(title);
		f.setVisible(true);
		f.setSize(500, 500);
		f.setLocation(250, 250);
	
		System.out.println(f.getLocation());
		f.setBackground(Color.yellow);
		b=new Button("Add");
		b1=new Button("Sub");
		l1=new  Label("Enter First number");
		l2=new  Label("Enter Second number");
		l3=new  Label("Result");
		tf1=new  TextField(10);
		tf2=new  TextField(10);
		tf3=new  TextField(10); 
		FlowLayout f1=new FlowLayout();
		f.setLayout(f1);
	
        f.add(l1);
		f.add(tf1);
		f.add(l2);
		f.add(tf2);
		f.add(l3);
		f.add(tf3);
		f.add(b);
		f.add(b1);
	
	
		b.addActionListener(this);
		b1.addActionListener(this);
	}
	public static void main(String arg[]) {
	GuiApp5 g=new GuiApp5("App");
	
}

	 
	@Override
	public void actionPerformed(ActionEvent e) {
	String n1=tf1.getText();
	String n2=tf2.getText();
	if(n1.equals(" ")&&n2.equals(" ")){
		
		JOptionPane.showMessageDialog(null, "Please fill all fields");
	}
	else {
		double d1=Double.parseDouble(n1);
		double d2=Double.parseDouble(n2);
		if(e.getActionCommand().equals("Add")) 
		{
			
			tf3.setText("Add="+(d1+d2));
		}else {
		tf3.setText("Sub="+(d1-d2));
	}
		
			
	}}
	}
