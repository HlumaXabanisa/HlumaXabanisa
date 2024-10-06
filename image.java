import javax.swing.*;
import java.awt.*;

public class image extends JPanel {
    private Image backgroundImage;

    public image() {
      
        backgroundImage = new ImageIcon("back.jpg").getImage(); 

        setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}
