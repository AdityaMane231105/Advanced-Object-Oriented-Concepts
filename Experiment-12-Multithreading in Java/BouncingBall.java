import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BallPanel extends JPanel implements Runnable {
    int x = 50, y = 50;
    int dx = 2, dy = 2;
    int radius = 20;
    Thread t;

    public BallPanel() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (t == null) {
                    t = new Thread(BallPanel.this);
                    t.start();
                }
            }
        });
    }

    public void run() {
        while (true) {
            x += dx;
            y += dy;

            if (x <= 0 || x + radius >= getWidth()) {
                dx = -dx;
            }
            if (y <= 0 || y + radius >= getHeight()) {
                dy = -dy;
            }

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, radius, radius);
    }
}

public class BouncingBall {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        BallPanel panel = new BallPanel();

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}