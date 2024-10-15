//Event handling 
package guiPrograming;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGuiApp1 extends Frame implements ActionListener {/*jisme apne gui ki conding ki hai usmelistner
interface ko implemnets kr do MyGuiApp listner class kahlayegi kyuki ye listner intetface ko implements kr 
rahi hai*/
	Frame f;
	Button b,b1;
	TextField tf;
	MyGuiApp1(String s){
		super(s);
		this.setVisible(true);
		this.setSize(400,400);
		this.setLayout(new FlowLayout());
		b=new Button("ok");
		this.setBackground(Color.yellow);
		b.addActionListener(this);//button hamari b hai  
		this.add(b);
		b1=new Button("cancle");
		b1.addActionListener(this);//button hamari b hai  
		this.add(b1);
		tf=new TextField(20);
		this.add(tf);
	}
	
		
	public static void main(String[] args) {
		MyGuiApp1 g=new MyGuiApp1("apple");
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button bt=(Button)e.getSource();
		if(bt==b)
	tf.setText("hello");		
		else	
			tf.setText("  ");	
	}

}
