import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioExample extends JFrame implements ActionListener {

    JRadioButton male, female;
    JButton submit;
    JLabel result;

    RadioExample() {
        setLayout(new FlowLayout());

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        submit = new JButton("Submit");
        result = new JLabel("");

        add(male);
        add(female);
        add(submit);
        add(result);

        submit.addActionListener(this);

        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (male.isSelected()) {
            result.setText("Selected: Male");
        } else if (female.isSelected()) {
            result.setText("Selected: Female");
        } else {
            result.setText("No selection");
        }
    }

    public static void main(String[] args) {
        new RadioExample();
    }
}