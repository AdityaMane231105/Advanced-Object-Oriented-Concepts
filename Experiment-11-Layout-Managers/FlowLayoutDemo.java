import java.awt.*;

public class FlowLayoutDemo extends Frame {

    FlowLayoutDemo() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        Checkbox c1 = new Checkbox("Java");
        Checkbox c2 = new Checkbox("Python");
        Checkbox c3 = new Checkbox("C++");

        add(c1);
        add(c2);
        add(c3);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}