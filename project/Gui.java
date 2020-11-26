import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Gui extends JFrame {

    int index = 0;
    String conc = "";

    private JButton create = new JButton("Create");
    private JButton delete = new JButton("Delete");

    private JButton next = new JButton("Next");
    private JButton previous = new JButton("Previous");

    private JTextArea name = new JTextArea(1, 10);
    private JTextArea hours = new JTextArea(1, 5);
    private JTextArea clockIn = new JTextArea(1, 5);
    private JTextArea textArea = new JTextArea(1, 30);

    private JLabel labelName = new JLabel("Name");
    private JLabel labelHours = new JLabel("Hours");
    private JLabel labelClockIn = new JLabel("Clock In");

    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JPanel panel4 = new JPanel();
    private JPanel panel5 = new JPanel();
    private JPanel panel6 = new JPanel();

    Factory f = new Factory();

    public Gui(ArrayList<Employee> employeeList, Tester s) {
        super();

        panel1.add(labelName);
        panel1.add(name);

        panel2.add(labelHours);
        panel2.add(hours);

        panel3.add(labelClockIn);
        panel3.add(clockIn);

        panel4.add(create);
        panel4.add(delete);

        panel5.add(next);
        panel5.add(previous);

        panel6.add(textArea);

        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        getContentPane().setLayout(gridbag);

        c.fill = GridBagConstraints.HORIZONTAL;

        c.gridx = 0;
        c.gridy = 0;

        gridbag.setConstraints(panel1, c);
        getContentPane().add(panel1);

        c.gridx = 0;
        c.gridy = 1;
        gridbag.setConstraints(panel2, c);
        getContentPane().add(panel2);

        c.gridx = 0;
        c.gridy = 3;
        gridbag.setConstraints(panel3, c);
        getContentPane().add(panel3);

        c.gridx = 0;
        c.gridy = 4;
        gridbag.setConstraints(panel4, c);
        getContentPane().add(panel4);

        c.gridx = 0;
        c.gridy = 5;

        gridbag.setConstraints(panel5, c);
        getContentPane().add(panel5);

        c.gridx = 0;
        c.gridy = 6;

        gridbag.setConstraints(panel6, c);
        getContentPane().add(panel6);

        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);

        setVisible(true);
        pack();

        this.setSize(350, 300);
        this.setVisible(true);

        conc = "Name: " + employeeList.get(index).getName() + 
        " Hours: " + employeeList.get(index).getHours() + 
        " Wages:" + employeeList.get(index).getWages() + "\n";    
        textArea.setText(conc);  


        // Takes the text boxes and serializes the information into the ser file
        // Then resets the text
        create.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String get_name = name.getText();
                String hours_get = hours.getText();
                double get_hours = Double.parseDouble(hours_get);
                String get_clock_in = clockIn.getText();

                Employee e1 = f.createEmployee(get_hours, get_name, get_clock_in);
                employeeList.add(e1);

                try {
                    s.Serialize(employeeList);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                name.setText("");
                hours.setText("");
                clockIn.setText("");
            } 
        }); 

        // Deletes an object, then saves the ser file
        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                employeeList.remove(index); 
                try {
                    s.Serialize(employeeList);
                } catch (IOException e) {
                    e.printStackTrace();
                }  
                textArea.setText("");
                conc = "Name: " + employeeList.get(0).getName() + 
                " Hours: " + employeeList.get(0).getHours() + 
                " Wages:" + employeeList.get(0).getWages() + "\n";    
                textArea.setText(conc); 
                index = 0;
            } 
        }); 

        // Moves the text boxes to the next object
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(index < employeeList.size()-1)
                {
                    index += 1;
                    conc = "Name: " + employeeList.get(index).getName() + 
                    " Hours: " + employeeList.get(index).getHours() + 
                    " Wages:" + employeeList.get(index).getWages() + "\n";    
                    textArea.setText(conc);   
                } 
            } 
        }); 

        // Moves the text boxes to the previous object
        previous.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(index > 0)
                {
                    index -= 1;
                    String conc = "";
                    conc = conc + "Name: " + employeeList.get(index).getName() + 
                    " Hours: " + employeeList.get(index).getHours() + 
                    " Wages:" + employeeList.get(index).getWages() + "\n";    
                    textArea.setText(conc);  
                }   
            } 
        });  

    }
}