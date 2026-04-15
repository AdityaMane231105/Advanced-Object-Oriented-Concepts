import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Counter extends JFrame implements ActionListener {

    JTextField tf;
    JButton up, down, reset;
    int count = 0;

    Counter() {
        setTitle("Counter");
        setLayout(new FlowLayout());

        add(new JLabel("Counter:"));

        tf = new JTextField("0", 10);
        add(tf);

        up = new JButton("Count Up");
        down = new JButton("Count Down");
        reset = new JButton("Reset");

        add(up);
        add(down);
        add(reset);

        up.addActionListener(this);
        down.addActionListener(this);
        reset.addActionListener(this);

        setSize(300,150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == up) {
            count++;
        } else if (e.getSource() == down) {
            count--;
        } else {
            count = 0;
        }
        tf.setText(String.valueOf(count));
    }

    public static void main(String[] args) {
        new Counter();
    }
}