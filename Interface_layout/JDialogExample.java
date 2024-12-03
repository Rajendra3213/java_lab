import java.awt.FlowLayout;
import javax.swing.*;

public class JDialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JDialog Example");
        
        JButton showDialogButton = new JButton("Show Dialog");
        showDialogButton.addActionListener(e -> {
            JDialog dialog = new JDialog(frame, "Dialog Example", true);
            dialog.add(new JLabel("This is a dialog message"));
            dialog.setSize(200, 100);
            dialog.setVisible(true);
        });
        
        frame.setLayout(new FlowLayout());
        frame.add(showDialogButton);
        
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
