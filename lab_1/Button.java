import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class Button implements ActionListener{
	
	JFrame window = new JFrame("event listener");
	JPanel panel = new JPanel();
	JButton buttonL = new JButton("Button Left");
	JButton buttonM = new JButton("Button Middle");
	JButton buttonR = new JButton("Button Right");
	JLabel label = new JLabel("Label");

    public Button()
	{

		buttonL.setPreferredSize(new Dimension(300,100));
		buttonM.setPreferredSize(new Dimension(300,100));
		buttonR.setPreferredSize(new Dimension(300,100));
		
		buttonL.addActionListener(this);
		buttonM.addActionListener(this);
		buttonR.addActionListener(this);
		
		panel.add(buttonL);
		panel.add(buttonM);
		panel.add(buttonR);
		panel.add(label);
		
		window.getContentPane().add(panel);
		window.setSize(500,700);
		window.pack();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(buttonL))
		{
			panel.setBackground(Color.red);
		}
		else if(e.getSource().equals(buttonM))
		{
			panel.setBackground(Color.blue);
		}
		else if(e.getSource().equals(buttonR))
		{
			panel.setBackground(Color.green);
		}
    }
    /*
    @Override
    public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(buttonL))
		{
			label.setText("Left Button was pressed");
		}
		else if(e.getSource().equals(buttonM))
		{
			label.setText("Middle Button was pressed");
		}
		else if(e.getSource().equals(buttonR))
		{
			label.setText("Right Button was pressed");
		}
		
    }
    */
	public static void main(String args[]) {
		Button frame = new Button();
	}

}
