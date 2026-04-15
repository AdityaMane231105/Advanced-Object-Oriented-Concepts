import javax.swing.*;
import java.awt.event.*;

public class TimerApp extends JFrame implements ActionListener {
    JButton start, stop;
    JLabel label;
    Timer timer;
    int count = 0;

    TimerApp() {
        start = new JButton("Start");
        stop = new JButton("Stop");
        label = new JLabel("0");

        start.setBounds(50, 100, 80, 30);
        stop.setBounds(150, 100, 80, 30);
        label.setBounds(120, 50, 100, 30);

        add(start);
        add(stop);
        add(label);

        start.addActionListener(this);
        stop.addActionListener(this);

        timer = new Timer(1000, e -> {
            count++;
            label.setText("" + count);
        });

        setSize(300, 250);
        setLayout(null);
        setTitle("Timer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start)
            timer.start();
        else
            timer.stop();
    }

    public static void main(String[] args) {
        new TimerApp();
    }
}

