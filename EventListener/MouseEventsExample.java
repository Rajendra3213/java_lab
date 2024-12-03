import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Events Example");
        JLabel label = new JLabel("Perform a mouse action");
        
        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                label.setText("Mouse pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("Mouse exited");
            }
        });
        
        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
