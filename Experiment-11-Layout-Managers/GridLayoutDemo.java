import java.awt.*;
import java.awt.event.*;

public class GridLayoutDemo extends Frame implements ActionListener {

    Button[] btn = new Button[6];
    int first = -1;

    GridLayoutDemo() {
        setLayout(new GridLayout(2, 3));

        for (int i = 0; i < 6; i++) {
            btn[i] = new Button(String.valueOf(i + 1));
            btn[i].addActionListener(this);
            add(btn[i]);
        }

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Button clicked = (Button) e.getSource();

        if (first == -1) {
            for (int i = 0; i < 6; i++) {
                if (btn[i] == clicked) {
                    first = i;
                    break;
                }
            }
        } else {
            for (int i = 0; i < 6; i++) {
                if (btn[i] == clicked) {

                    String temp = btn[first].getLabel();
                    btn[first].setLabel(btn[i].getLabel());
                    btn[i].setLabel(temp);

                    first = -1;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}