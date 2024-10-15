package guiPrograming;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class MyGraphics extends Frame {
	public void paint(Graphics graphics) {
		graphics.setColor(Color.blue);
	graphics.drawLine(100, 100, 100, 100);
	graphics.drawRect(100, 100, 100, 100);
	graphics.drawOval(100, 50, 100, 50);
	graphics.fillRect(30, 30, 30, 70);
	}

	public static void main(String args[]) {
		MyGraphics g=new MyGraphics();
		g.setBackground(Color.yellow);
		g.setSize(400,400);
		g.setVisible(true);
		
		//Graphics gt=g.getGraphics(); ye bhi ek tarika hai graphics design krne ka 
		
	}
}
