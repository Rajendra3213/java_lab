import javax.swing.*;
import java.awt.*;

public class CheckBoxRadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBox and RadioButton Example");
        
        JCheckBox checkBox = new JCheckBox("Check me");
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        
        frame.setLayout(new FlowLayout());
        frame.add(checkBox);
        frame.add(radioButton1);
        frame.add(radioButton2);
        
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
