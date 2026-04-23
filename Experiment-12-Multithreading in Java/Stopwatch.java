import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Stopwatch extends JFrame implements Runnable {
    JLabel label;
    JButton startBtn, stopBtn, resetBtn;

    int seconds = 0;
    boolean running = false;
    Thread t;

    public Stopwatch() {
        label = new JLabel("Time: 0 sec");
        label.setFont(new Font("Arial", Font.BOLD, 20));

        startBtn = new JButton("Start");
        stopBtn = new JButton("Stop");
        resetBtn = new JButton("Reset");

        startBtn.addActionListener(e -> {
            if (!running) {
                running = true;
                t = new Thread(this);
                t.start();
            }
        });

        stopBtn.addActionListener(e -> running = false);

        resetBtn.addActionListener(e -> {
            running = false;
            seconds = 0;
            label.setText("Time: 0 sec");
        });

        setLayout(new FlowLayout());
        add(label);
        add(startBtn);
        add(stopBtn);
        add(resetBtn);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void run() {
        while (running) {
            seconds++;
            label.setText("Time: " + seconds + " sec");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        new Stopwatch();
    }
}