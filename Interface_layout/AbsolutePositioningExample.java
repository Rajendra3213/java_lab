import javax.swing.*;
import java.awt.*;

public class AbsolutePositioningExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("No Layout (Absolute Positioning)");
        frame.setLayout(null);
        
        JButton button1 = new JButton("Button 1");
        button1.setBounds(50, 50, 100, 30);
        
        JButton button2 = new JButton("Button 2");
        button2.setBounds(200, 50, 100, 30);
        
        frame.add(button1);
        frame.add(button2);
        
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
