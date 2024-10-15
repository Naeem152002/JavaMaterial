package guiPrograming;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OuterClass implements ActionListener  {
	
	 MyGuiApp2 g;
	 OuterClass(MyGuiApp2 g){
		 this.g=g;
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button bt=(Button)e.getSource();
		
		if(bt==g.b)
	g.tf.setText("hello");		
		else	
			g.tf.setText("  ");	
	}

}


