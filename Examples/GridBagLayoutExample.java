import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutExample extends JFrame{

    private JButton button1 = new JButton("Button1");
    private JButton button2 = new JButton("Button2");
    private JButton button3 = new JButton("Button3");
    private JButton button4 = new JButton("Button4");
    private JButton button5 = new JButton("Button5");

    public GridBagLayoutExample() {
        super();
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        getContentPane().setLayout(gridbag);

        c.fill = GridBagConstraints.HORIZONTAL;

        c.gridx = 0;
        c.gridy = 0;

        gridbag.setConstraints(button1, c);
        getContentPane().add(button1);

        c.gridx = 1;
        c.gridy = 0;
        gridbag.setConstraints(button2, c);
        getContentPane().add(button2);

        c.gridx = 2;
        c.gridy = 0;
        gridbag.setConstraints(button3, c);
        getContentPane().add(button3);

        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 1;
        gridbag.setConstraints(button4, c);
        getContentPane().add(button4);

        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 5;
        gridbag.setConstraints(button5, c);
        getContentPane().add(button5);

        setVisible(true);
        pack();

    }

    public static void main(String [] args) {
        new GridBagLayoutExample();
    }

}