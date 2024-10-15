package guiPrograming;

import java.awt.Button;
import java.awt.TextComponent;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class OuterClass2 implements ActionListener  {
	GuiApp6 t;
	
	OuterClass2(GuiApp6 t){
		this.t=t;
	}
	 
	@Override
	public void actionPerformed(ActionEvent e) {
	String n1=t.tf1.getText();
	String n2=t.tf2.getText();
	if(n1.equals(" ")&&n2.equals(" ")){
		
		JOptionPane.showMessageDialog(null, "Please fill all fields");
	}
	else {
		double d1=Double.parseDouble(n1);
		double d2=Double.parseDouble(n2);
		if(e.getActionCommand().equals("Div")) {
			t.tf3.setText("Div="+(d1/d2));
		}else {
		t.tf3.setText("Mul="+(d1*d2));
	}
		
			
	}

}}

