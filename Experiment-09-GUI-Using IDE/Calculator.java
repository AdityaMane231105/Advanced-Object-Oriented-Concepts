import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField tf;
    String num1 = "", num2 = "", operator = "";

    Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        tf = new JTextField();
        tf.setFont(new Font("Arial", Font.BOLD, 20));
        add(tf, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        String buttons[] = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0","C","=","+",
                "%","√","x²",""
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 16));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("[0-9]")) {
            tf.setText(tf.getText() + cmd);
        }
        else if (cmd.equals("C")) {
            tf.setText("");
            num1 = num2 = operator = "";
        }
        else if (cmd.equals("=")) {
            num2 = tf.getText();
            double n1 = Double.parseDouble(num1);
            double n2 = Double.parseDouble(num2);
            double result = 0;

            switch (operator) {
                case "+": result = n1 + n2; break;
                case "-": result = n1 - n2; break;
                case "*": result = n1 * n2; break;
                case "/": result = n1 / n2; break;
            }

            tf.setText(String.valueOf(result));
        }
        else if (cmd.equals("√")) {
            double val = Double.parseDouble(tf.getText());
            tf.setText(String.valueOf(Math.sqrt(val)));
        }
        else if (cmd.equals("x²")) {
            double val = Double.parseDouble(tf.getText());
            tf.setText(String.valueOf(val * val));
        }
        else {
            operator = cmd;
            num1 = tf.getText();
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}