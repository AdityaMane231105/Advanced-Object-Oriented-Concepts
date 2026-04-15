import javax.swing.*;
import java.awt.event.*;

public class TextCounter extends JFrame implements KeyListener {
    JTextArea area;
    JLabel label;

    TextCounter() {
        area = new JTextArea();
        label = new JLabel("Chars: 0 Words: 0");

        area.setBounds(50, 50, 200, 100);
        label.setBounds(50, 160, 200, 30);

        area.addKeyListener(this);

        add(area);
        add(label);

        setSize(300, 250);
        setLayout(null);
        setTitle("Text Counter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyReleased(KeyEvent e) {
        String text = area.getText();
        int chars = text.length();
        int words = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;

        label.setText("Chars: " + chars + " Words: " + words);
    }

    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {}

    public static void main(String[] args) {
        new TextCounter();
    }
}