//method 3:anymous
package guiPrograming;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class MyGuiApp4 extends Frame implements ActionListener {

	Frame f;
	Button b,b1;
	TextField tf;
	MyGuiApp4(String s){
		super(s);
		this.setVisible(true);
		this.setSize(400,400);
		this.setLayout(new FlowLayout());
		b=new Button("ok");
		this.setBackground(Color.yellow);
	    this.add(b);
		b1=new Button("cancle");
	    this.add(b1);
		tf=new TextField(20);
		this.add(tf);
		
		b.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ji");
			}
	});
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			System.out.println("how are you");	
			}
				
		}	);
	
	
	}
	public static void main(String[] args) {
MyGuiApp4 g=new MyGuiApp4("apple");
		// TODO Auto-generated method stub

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		
		Button bt=(Button)e.getSource();
		if(bt==b)
	tf.setText("hello");		
		else	
			tf.setText("  ");	
		
	}

}
