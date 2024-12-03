import java.awt.FlowLayout;
import javax.swing.*;

public class JLabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel Example");
        
        JLabel label1 = new JLabel("This is a simple label");
        JLabel label2 = new JLabel("Another label with text alignment", JLabel.CENTER);
        
        frame.setLayout(new FlowLayout());
        frame.add(label1);
        frame.add(label2);
        
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
