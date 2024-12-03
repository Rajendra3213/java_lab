import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdapterClassExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Adapter Class Example");
        JLabel label = new JLabel("Click anywhere");

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse clicked at X: " + e.getX() + ", Y: " + e.getY());
            }
        });

        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
