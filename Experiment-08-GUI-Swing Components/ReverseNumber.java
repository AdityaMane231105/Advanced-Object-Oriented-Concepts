import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumber extends JFrame implements ActionListener {

    JTextField input, output;
    JButton btn;

    ReverseNumber() {
        setLayout(new FlowLayout());

        add(new JLabel("Enter Number:"));
        input = new JTextField(10);
        add(input);

        btn = new JButton("Reverse");
        add(btn);

        add(new JLabel("Reversed:"));
        output = new JTextField(10);
        output.setEditable(false);
        add(output);

        btn.addActionListener(this);

        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String num = input.getText();
        String rev = new StringBuilder(num).reverse().toString();
        output.setText(rev);
    }

    public static void main(String[] args) {
        new ReverseNumber();
    }
}