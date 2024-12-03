import javax.swing.*;

public class TextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField, JPasswordField, JTextArea Example");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        
        JTextField textField = new JTextField("Enter text here");
        JPasswordField passwordField = new JPasswordField("Password");
        JTextArea textArea = new JTextArea("Enter some long text here");
        
        frame.add(textField);
        frame.add(passwordField);
        frame.add(new JScrollPane(textArea));
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
