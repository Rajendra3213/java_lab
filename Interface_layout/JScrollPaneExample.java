import javax.swing.*;

public class JScrollPaneExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollPane Example");
        
        JTextArea textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        frame.add(scrollPane);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
