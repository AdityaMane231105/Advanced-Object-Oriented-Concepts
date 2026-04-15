import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger extends JFrame implements ActionListener {
    JComboBox<String> combo;

    String[] colors = {"Red", "Green", "Blue", "Yellow"};

    ColorChanger() {
        combo = new JComboBox<>(colors);
        combo.setBounds(100, 100, 120, 30);

        combo.addActionListener(this);

        add(combo);

        setSize(300, 250);
        setLayout(null);
        setTitle("Background Color Changer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String color = (String) combo.getSelectedItem();

        if (color.equals("Red"))
            getContentPane().setBackground(Color.RED);
        else if (color.equals("Green"))
            getContentPane().setBackground(Color.GREEN);
        else if (color.equals("Blue"))
            getContentPane().setBackground(Color.BLUE);
        else
            getContentPane().setBackground(Color.YELLOW);
    }

    public static void main(String[] args) {
        new ColorChanger();
    }
}