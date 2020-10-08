import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EmptyBoxes extends JFrame{

    private JButton button1 = new JButton("");
    private JButton button2 = new JButton("");
    private JButton button3 = new JButton("");

    public EmptyBoxes() {
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
        c.gridy = 2;
        gridbag.setConstraints(button2, c);
        getContentPane().add(button2);

        c.gridx = 2;
        c.gridy = 0;
        gridbag.setConstraints(button3, c);
        getContentPane().add(button3);

        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 1;

        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 5;

        setVisible(true);
        pack();

        this.setSize(250,250);
		this.setVisible(true);

    }

    public static void main(String [] args) {
        new EmptyBoxes();
    }

}