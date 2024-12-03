import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Item Events Example");
        JCheckBox checkBox = new JCheckBox("Check me");
        JLabel label = new JLabel("Checkbox status: unchecked");

        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    label.setText("Checkbox status: checked");
                } else {
                    label.setText("Checkbox status: unchecked");
                }
            }
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(checkBox);
        frame.add(label);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
