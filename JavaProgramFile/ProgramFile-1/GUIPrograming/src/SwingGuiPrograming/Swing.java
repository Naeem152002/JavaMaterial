package SwingGuiPrograming;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing {
	public static void main(String args[]) {
		JFrame j=new JFrame("app");
		j.setVisible(true);
		j.setSize(500, 500);
		j.setLocation(250, 250);
		j.setLayout(new FlowLayout());
		j.setBackground(Color.yellow);
	JButton	b=new JButton("Ok");
	j.add(b);
	j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
