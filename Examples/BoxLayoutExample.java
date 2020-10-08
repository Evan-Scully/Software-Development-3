import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutExample extends JFrame {

    private JButton button1 = new JButton("Button1");
    private JButton button2 = new JButton("Button2");
    private JButton button3 = new JButton("Button3");
    private JButton button4 = new JButton("Button4");
    private JButton button5 = new JButton("Button5");

    public BoxLayoutExample() {

        getContentPane().setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

        button1.setAlignmentX(Component.LEFT_ALIGNMENT);
        getContentPane().add(button1);

        button2.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        getContentPane().add(button2);

        button3.setAlignmentX(Component.CENTER_ALIGNMENT);
        getContentPane().add(button3);

        button4.setAlignmentX(Component.RIGHT_ALIGNMENT);
        getContentPane().add(button4);

        button5.setAlignmentX(Component.TOP_ALIGNMENT);
        getContentPane().add(button5);

        setSize(250, 175);
        setVisible(true);

    }

    public static void main(String[] args) {
        new BoxLayoutExample();
    }

}