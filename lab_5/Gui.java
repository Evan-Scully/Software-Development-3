import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.lang.model.util.ElementScanner6;
import javax.swing.*;  
import java.awt.event.*; 
import java.awt.Color;  

public class Gui extends JFrame{

    private JButton button1 = new JButton("");
    private JButton button2 = new JButton("");
    private JButton button3 = new JButton("");
    JCheckBox checkBox1 = new JCheckBox("fuck the italians");  

    public Gui() {
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

        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 5;

        getContentPane().add(checkBox1);

        setVisible(true);
        pack();

        this.setSize(250,250);
        this.setVisible(true);

        button1.setBackground(Color.GREEN);
        button2.setBackground(Color.WHITE);
        button3.setBackground(Color.YELLOW);

        checkBox1.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {
                if(checkBox1.isSelected()){                   
                    button1.setBackground(Color.GREEN);
                    button2.setBackground(Color.WHITE);
                    button3.setBackground(Color.YELLOW);
                    checkBox1.setText("fuck the italians"); 
                }
                else
                {
                    button3.setBackground(Color.RED);
                    checkBox1.setText("fuck the irish"); 
                }
            }
        }); 

    }

    public static void main(String [] args) {
        new Gui();
    }

}