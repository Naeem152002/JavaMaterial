package ui;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

public class WelcomeUi {
			public WelcomeUi(String row[][], String cols[]) {
				
				JFrame frame=new JFrame("Welcome");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(220, 400);
				frame.setLayout(new  FlowLayout());
				JTable jTable=new JTable(row,cols);
				frame.add(jTable);
//				JButton[][] buttonsRow=new JButton[row.length][3];
//				JButton[] buttonsCols=new JButton[3];
//				buttonsRow[0][0]=new JButton("");
//				buttonsRow[0][1]=new JButton("Actions");
//				buttonsRow[0][2]=new JButton("");
//				for (int i = 1; i < buttonsRow.length; i++) {
//						buttonsRow[i][0]=new JButton("Update");
//						buttonsRow[i][1]=new JButton("Delete");
//						buttonsRow[i][2]=new JButton("View");
//				}
//				buttonsCols[0]=new JButton("Update");
//				buttonsCols[1]=new JButton("Delete");
//				buttonsCols[2]=new JButton("View");
//				JTable jTable2=new JTable(buttonsRow,buttonsCols);
//				frame.add(jTable2);
				frame.setVisible(true);
			}
}
