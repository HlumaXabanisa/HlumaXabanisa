package main;
import javax.swing.*;
import java.awt.event.*;



public class MainMenu extends JFrame  {
	public MainMenu() {
		setTitle("Tic Tac Toe");
		JPanel panel=new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton start=new JButton("sTART)");
		START.setBounds(150,50,100,30);
		panel.add(start);
	}
	
}
