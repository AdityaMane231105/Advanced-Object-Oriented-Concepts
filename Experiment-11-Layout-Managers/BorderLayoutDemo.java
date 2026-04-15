import java.awt.*;
import java.awt.event.*;

public class BorderLayoutDemo extends Frame implements ActionListener {

    TextField input, result;
    Button b1, b2, b3;

    BorderLayoutDemo() {
        setLayout(new BorderLayout());

        Panel p1 = new Panel();
        p1.add(new Label("Enter Number: "));
        input = new TextField(10);
        p1.add(input);
        add(p1, BorderLayout.NORTH);

        Panel p2 = new Panel();
        b1 = new Button("Binary");
        b2 = new Button("Octal");
        b3 = new Button("Hex");

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        add(p2, BorderLayout.CENTER);

        Panel p3 = new Panel();
        p3.add(new Label("Result: "));
        result = new TextField(10);
        p3.add(result);
        add(p3, BorderLayout.SOUTH);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(input.getText());

        if (e.getSource() == b1)
            result.setText(Integer.toBinaryString(num));
        else if (e.getSource() == b2)
            result.setText(Integer.toOctalString(num));
        else if (e.getSource() == b3)
            result.setText(Integer.toHexString(num));
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}