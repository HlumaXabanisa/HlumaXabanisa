import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class second {
	
    public static void main(String[] args) {
     
        JButton start = new JButton("Start");
        JButton exit = new JButton("Exit");

		JPanel panel=new JPanel();
        panel.setBackground(Color.BLACK);
		

        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
		
		JLabel title =new JLabel("Tic Tac Toe");
		title.setForeground(Color.GREEN);
		
		start.setOpaque(false);
		start.setContentAreaFilled(false);
		start.setBorderPainted(false);
		start.setBorder( null );
		start.setFont(new Font("Piccolo", Font.BOLD, 40));
		start.setForeground(Color.PINK);
		
		exit.setOpaque(false);
		exit.setContentAreaFilled(false);
		exit.setBorderPainted(false);
		exit.setBorder(null);
		exit.setFont(new Font("Piccolo", Font.BOLD,40));
		exit.setForeground(Color.BLUE);
		
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
		
                System.exit(0);
				
            }
        });

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

		add(title);
        add(start);
        add(exit);
		
		setVisible(true);
        
    }
}

	
		
	