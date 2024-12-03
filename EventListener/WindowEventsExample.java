import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEventsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Events Example");
        JLabel label = new JLabel("Close the window or minimize it");

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing...");
                System.exit(0);
            }

            @Override
            public void windowIconified(WindowEvent e) {
                label.setText("Window minimized");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                label.setText("Window restored");
            }
        });

        frame.add(label);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
    }
}
