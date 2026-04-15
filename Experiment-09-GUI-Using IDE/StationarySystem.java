import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StationarySystem extends JFrame implements ActionListener {

    JCheckBox notebook, pen, pencil;
    JButton order;

    StationarySystem() {
        setTitle("Stationary Purchase System");
        setSize(350, 300);
        setLayout(new FlowLayout());

        notebook = new JCheckBox("Notebook @ 50");
        pen = new JCheckBox("Pen @ 20");
        pencil = new JCheckBox("Pencil @ 10");

        order = new JButton("Order");

        add(notebook);
        add(pen);
        add(pencil);
        add(order);

        order.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int total = 0;
        String message = "";

        if (notebook.isSelected()) {
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity for Notebook"));
            total += qty * 50;
            message += "Notebook Quantity: " + qty + "\n";
        }

        if (pen.isSelected()) {
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity for Pen"));
            total += qty * 20;
            message += "Pen Quantity: " + qty + "\n";
        }

        if (pencil.isSelected()) {
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity for Pencil"));
            total += qty * 10;
            message += "Pencil Quantity: " + qty + "\n";
        }

        message += "\nTotal: " + total;

        JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(this, "Successfully Ordered!", "Alert", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        new StationarySystem();
    }
}