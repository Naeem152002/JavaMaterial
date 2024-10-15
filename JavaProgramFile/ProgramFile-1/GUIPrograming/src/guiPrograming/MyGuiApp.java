//Event handling 
package guiPrograming;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGuiApp extends Frame implements ActionListener {/*jisme apne gui ki conding ki hai usmelistner
interface ko implemnets kr do MyGuiApp listner class kahlayegi kyuki ye listner intetface ko implements kr 
rahi hai*/
	Frame f;
	Button b;
	MyGuiApp(String s){
		super(s);
		this.setVisible(true);
		this.setSize(400,400);
		this.setLayout(new FlowLayout());
		b=new Button("ok");
		this.setBackground(Color.yellow);
		b.addActionListener(this);//button hamari b hai  
		this.add(b);
	}
		
	public static void main(String[] args) {
		MyGuiApp g=new MyGuiApp("apple");
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

}
