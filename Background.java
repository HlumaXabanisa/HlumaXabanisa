import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Background extends JFrame {
    public Background() {
        setTitle("Game with Black Background");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Tic Tac Toe");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Bauhaus 93", Font.BOLD, 65));
        titleLabel.setBounds(200, 50, 400, 100);
        panel.add(titleLabel);

        JButton single = new JButton("Single Player");
        single.setFont(new Font("Bauhaus 93", Font.BOLD, 50));
        single.setBounds(200, 200, 400, 100);
		single.setOpaque(false);
		single.setContentAreaFilled(false);
		single.setBorderPainted(false);
		single.setBorder( null );
		single.setForeground(Color.GREEN);
		setResizable(false);
		
		
		JButton exit = new JButton("Quit ?");
        exit.setFont(new Font("Bauhaus 93", Font.BOLD, 50));
        exit.setBounds(200, 400, 400, 100);
		exit.setOpaque(false);
		exit.setContentAreaFilled(false);
		exit.setBorderPainted(false);
		exit.setBorder( null );
		exit.setForeground(Color.PINK);
		
		
		
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
		
    }

    public static void main(String[] args) {
        new Background();
    }
}
