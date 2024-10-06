import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Background extends JFrame {
    public Background() {
        setTitle("Main Menu");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


		image panel=new image();
        panel.setLayout(null);

        //JLabel titleLabel = new JLabel("Tic Tac Toe");
		
		

        /*titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Goudy Stout", Font.BOLD, 32));
        titleLabel.setBounds(200, 50, 400, 100);*/
        //panel.add(titleLabel);


        JButton single = new JButton("PLAY GAME");
        single.setFont(new Font("Bauhaus 93", Font.BOLD, 50));
        single.setBounds(400, 330, 400, 100);
		single.setOpaque(false);
		single.setContentAreaFilled(false);
		single.setBorderPainted(false);
		single.setBorder( null );
		single.setForeground(Color.WHITE);
		
		
		JButton exit = new JButton("QUIT");
        exit.setFont(new Font("Bauhaus 93", Font.BOLD, 50));
        exit.setBounds(400, 450, 400, 100);
		exit.setOpaque(false);
		exit.setContentAreaFilled(false);
		exit.setBorderPainted(false);
		exit.setBorder( null );
		exit.setForeground(Color.WHITE);
		
		
		
		
        single.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GamePanel();
            }
        });
		
		
		
		exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
		
		
		
        panel.add(single);
		panel.add(exit);
        add(panel);
        setVisible(true);
		setResizable(false);
		
		
    }
	

    public static void main(String[] args) {
	
        new Background();
    }
}
