import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;


public class Interface extends JFrame {
    public void initialize() {
        JFrame frame = new JFrame();
        
        frame.setTitle("Jframe tittle disini");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("Convert/src/Logo.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.darkGray);
    }
    public static void main(String[] args) {
        Interface in = new Interface();
        in.initialize();
    }
}
