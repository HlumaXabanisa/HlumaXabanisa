import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import javax.swing.*;

public class GamePanel extends JPanel implements ActionListener {
	Thread gameThread; 
	Random rand= new Random();
	JFrame frame =  new JFrame("Tic-Tac-Toe");
	// JPanel this= new JPanel();
	
	JPanel button=new JPanel();
	JLabel txt= new JLabel(); //label to display text field
	
	JButton [] buttons = new JButton[9];
	boolean X_turn; //true if X false if y
	
	public void resetPanel() {
			// Clear the existing panel
			this.removeAll();
			
			// Reinitialize the label
			txt.setText("Tic-Tac-Toe");
			txt.setForeground(Color.BLACK);
			
			// Reinitialize buttons
			button.removeAll(); // Clear old buttons
			for (int i = 0; i < 9; i++) {
				buttons[i] = new JButton();
				buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
				buttons[i].setFocusable(false);
				buttons[i].setBackground(new Color(200, 200, 200));
				buttons[i].addActionListener(this);
				button.add(buttons[i]);
			}
			
			// Add components back to the panel
			this.add(txt);
			frame.add(this,BorderLayout.NORTH);
			frame.add(button);
			
			// this.add(button);
			
			// Revalidate and repaint
			this.revalidate();
			this.repaint();
			// Restart the game
			player1();
		}
		
		
	
	GamePanel (){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		//frame.getContentPane().setBackground(new Color(0, 0 ,153));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		txt.setBackground(new Color(169,169,169));//dark grey
		txt.setForeground(new Color(0,0,0));//text color
		txt.setFont(new Font("Comic Sans MS", Font.BOLD, 75));

		txt.setHorizontalAlignment(JLabel.CENTER);
		txt.setText("Tic-Tac-Toe");
		txt.setOpaque(true);
		
		this.setLayout(new BorderLayout());
		this.setBounds(0,0,800,100); //where to start
		
		button.setLayout(new GridLayout(3,3));
		button.setForeground(new Color(169, 169, 169));//grey
		
		//takes car of button 1 through 9
		for(int i =0; i<9;i++) {
			buttons[i]= new JButton();
			button.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli",Font.BOLD,120)); //to be soon changed
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
			
			buttons[i].setBackground(new Color(200, 200, 200));
		}
		
		this.add(txt);
		frame.add(this,BorderLayout.NORTH);
		frame.add(button);
		
		player1();
		
		
		
	}
	public void actionPerformed(ActionEvent e) {
		
		for(int i =0; i<9; i++) {
			if(e.getSource()==buttons[i]) {
	
				if(X_turn) {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(0,162,255));
						buttons[i].setText("X");
						
						X_turn=false;
						
						txt.setText("O turn");
						check();
						
					}
				}else {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(255,0,102));
						buttons[i].setText("O");
						
						X_turn=true;
						
						txt.setText("X turn");
					check();
				}
			}
			}
		
	}
	}
	//method determining whose turn is first(X or O)
	 public  void player1() {
		 
		 try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 
		 if(rand.nextInt(2)==0) {
			 X_turn=true;
			 txt.setText("X Turn");
			 
		 }else {
			 X_turn=false;
			 txt.setText("O Turn");
		 }
		 
	 }
	 
	 public void check() {     //check winner

		 boolean tie = true;
		 for(int i = 0; i < 9; i++) {
			 if(buttons[i].getText()=="") {
				 tie = false;
			 }
		 }
		 
		 if(tie) {
			 isTie();// this is a tie method
			 //hluma
		 }

		 
		 if(
				 (buttons[0].getText()=="X")&&
				 (buttons[1].getText()=="X")&&
				 (buttons[2].getText()=="X")
				 )
			{
			 player1Wins(0,1,2);
			 
		 }
		 if(
				 (buttons[3].getText()=="X")&&
				 (buttons[4].getText()=="X")&&
				 (buttons[5].getText()=="X")
				 )
			{
			 player1Wins(3,4,5);
			 
		 }
		 if(
				 (buttons[6].getText()=="X")&&
				 (buttons[7].getText()=="X")&&
				 (buttons[8].getText()=="X")
				 )
			{
			 player1Wins(6,7,8);
			 
		 }
		 if(
				 (buttons[0].getText()=="X")&&
				 (buttons[3].getText()=="X")&&
				 (buttons[6].getText()=="X")
				 )
			{
			 player1Wins(0,3,6);
			 
		 }
		 if(
				 (buttons[1].getText()=="X")&&
				 (buttons[4].getText()=="X")&&
				 (buttons[7].getText()=="X")
				 )
			{
			 player1Wins(1,4,7);
			 
		 }
		 if(
				 (buttons[2].getText()=="X")&&
				 (buttons[5].getText()=="X")&&
				 (buttons[8].getText()=="X")
				 )
			{
			 player1Wins(2,5,8);
			 
		 }
		 if(
				 (buttons[0].getText()=="X")&&
				 (buttons[4].getText()=="X")&&
				 (buttons[8].getText()=="X")
				 )
			{
			 player1Wins(0,4,8);
			 
		 }
		 if(
				 (buttons[2].getText()=="X")&&
				 (buttons[4].getText()=="X")&&
				 (buttons[6].getText()=="X")
				 )
			{
			 player1Wins(2,4,6);
			 
		 }
		 
		 
		 //For O's
		 
		 if(
				 (buttons[0].getText()=="O")&&
				 (buttons[1].getText()=="O")&&
				 (buttons[2].getText()=="O")
				 )
			{
			 player2Wins(0,1,2);
			 
		 }
		 if(
				 (buttons[3].getText()=="O")&&
				 (buttons[4].getText()=="O")&&
				 (buttons[5].getText()=="O")
				 )
			{
			 player2Wins(3,4,5);
			 
		 }
		 if(
				 (buttons[6].getText()=="O")&&
				 (buttons[7].getText()=="O")&&
				 (buttons[8].getText()=="O")
				 )
			{
			 player2Wins(6,7,8);
			 
		 }
		 if(
				 (buttons[0].getText()=="O")&&
				 (buttons[3].getText()=="O")&&
				 (buttons[6].getText()=="O")
				 )
			{
			 player2Wins(0,3,6);
			 
		 }
		 if(
				 (buttons[1].getText()=="O")&&
				 (buttons[4].getText()=="O")&&
				 (buttons[7].getText()=="O")
				 )
			{
			 player2Wins(1,4,7);
			 
		 }
		 if(
				 (buttons[2].getText()=="O")&&
				 (buttons[5].getText()=="O")&&
				 (buttons[8].getText()=="O")
				 )
			{
			 player2Wins(2,5,8);
			 
		 }
		 if(
				 (buttons[0].getText()=="O")&&
				 (buttons[4].getText()=="O")&&
				 (buttons[8].getText()=="O")
				 )
			{
			 player2Wins(0,4,8);
			 
		 }
		 if(
				 (buttons[2].getText()=="O")&&
				 (buttons[4].getText()=="O")&&
				 (buttons[6].getText()=="O")
				 )
			{
			 player2Wins(2,4,6);
			 
		 }
		 
		
	 }
		 

		 

	 
	public void player1Wins(int x,int y, int z) {
		buttons[x].setBackground(Color.GREEN);
		buttons[y].setBackground(Color.GREEN);
		buttons[z].setBackground(Color.GREEN);
		
		
		for (int i=0; i<9;i++) {
			buttons[i].setEnabled(false);
			
		}
		txt.setText("X is the winner!");
		int result= JOptionPane.showConfirmDialog(null, "Do you still want to continue?", "Confirmation", JOptionPane.YES_NO_OPTION);
		if(result == 0){
			resetPanel();
		}else{
			new Background();
		}
	}
	public void player2Wins(int x,int y, int z) {
		buttons[x].setBackground(Color.GREEN);
		buttons[y].setBackground(Color.GREEN);
		buttons[z].setBackground(Color.GREEN);
		
		
		for (int i=0; i<9;i++) {
			buttons[i].setEnabled(false);
			
		}
		txt.setText("O is the winner!");
		int result= JOptionPane.showConfirmDialog(null, "Do you still want to continue?", "Confirmation", JOptionPane.YES_NO_OPTION);
		if(result == 0){
			resetPanel();
		}else{
			new Background();
		}
		
	}
	
	
	public void isTie() {
		for (int i=0; i<9;i++) {
			buttons[i].setEnabled(false);
			
		}
		
		txt.setText("Tie!");
		int result= JOptionPane.showConfirmDialog(null, "Do you still want to continue?", "Confirmation", JOptionPane.YES_NO_OPTION);
		if(result == 0){
			resetPanel();
		}else{
			new Background();
		}
		
	}
	
	public void Draw(int x, int y, int z) {

		for(int i=0; i<9;i++) {
			buttons[i].setEnabled(true);
		}
		
		txt.setText("Its a tie!");
		
	}
	

}

