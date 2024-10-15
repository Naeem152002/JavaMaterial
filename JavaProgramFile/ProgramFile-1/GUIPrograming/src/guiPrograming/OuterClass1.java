package guiPrograming;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OuterClass1 implements ActionListener  {
	
	Button b;
	TextField tf;
	 OuterClass1(Button b ,TextField tf){
		 this.b=b;
		 this.tf=tf;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button bt=(Button)e.getSource();
		
		if(bt==b)
	tf.setText("Naeem kuraishi ");		
		else	
			tf.setText("  ");	
	}

}
