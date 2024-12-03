import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

public class GroupLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GroupLayout Example");
        
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addComponent(button1)
                .addComponent(button2)
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.BASELINE)
                .addComponent(button1)
                .addComponent(button2)
        );
        
        frame.add(panel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
