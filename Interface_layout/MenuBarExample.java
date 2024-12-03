import javax.swing.*;

public class MenuBarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MenuBar Example");
        
        JMenuBar menuBar = new JMenuBar();
        
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        menuBar.add(fileMenu);
        
        frame.setJMenuBar(menuBar);
        
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
