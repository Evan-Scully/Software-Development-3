import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class Main extends JFrame {

    private JButton button1 = new JButton("Display");
    private JButton button2 = new JButton("Clear");

    public Main(ArrayList<Phone> list) {
        super();

        JTextArea textArea = new JTextArea();
        getContentPane().add(button1);
        getContentPane().add(button2);
        getContentPane().add(textArea);

        
        textArea.setColumns(20);
        textArea.setLineWrap(true);
        textArea.setRows(10);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);

        setVisible(true);
        pack();

        this.setSize(600,200);
        this.setVisible(true);

        getContentPane().setLayout(new FlowLayout());

       
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String conc = "";
                for(int i = 0; i < list.size(); i++)
                {
                    conc = conc + list.get(i).toString() + "\n"; 
                }   
                textArea.setText(conc);      
            } 
        }); 

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                textArea.setText("");            
                } 
        }); 

    }

    public static void Serialize(ArrayList<Phone> list) throws IOException {
        try {
            FileOutputStream fileOut = new FileOutputStream("Phone.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            for (int i = 0; i < list.size(); i++) {
                objectOut.writeObject(list.get(i));
            }
            objectOut.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Phone> Deserialize() throws IOException, ClassNotFoundException {

        ArrayList<Phone> list2 = new ArrayList<Phone>();
                    
        FileInputStream fileIn = new FileInputStream("Phone.ser");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);

        try {

            while(true) {
                Phone newPhone = (Phone) objectIn.readObject();
                list2.add(newPhone);
            }
            /*
            while(objectIn.readLine() != null)
            {
                Phone newPhone = (Phone) objectIn.readObject();
                list2.add(newPhone);
            }
            */

        } catch (EOFException e) {
            System.out.println("All objects have been read in");
        }
        objectIn.close();
        return list2;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Phone p1 = new Phone("Sony", "Experia X", 32, 12.5, 4.6, true, 150);
        Phone p2 = new Phone("Sony", "Experia Z", 64, 14.2, 5.6, true, 175);
        Phone p3 = new Phone("Samsung", "Galaxy M", 64, 14.5, 5.4, true, 180);
        Phone p4 = new Phone("Nokia", "3330", 16, 13.2, 2.3, false, 90);
        Phone p5 = new Phone("Motorola", "M1", 8, 11.3, 4.9, true, 100);
        Phone p6 = new Phone("IPhone", "6", 32, 13.5, 6.4, true, 250);
        Phone p7 = new Phone("Alcatel", "A3", 8, 9.3, 2.4, false, 50);

        ArrayList<Phone> list = new ArrayList<Phone>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);

        // Serializes the original list and Deserializes it
        Serialize(list);
        list = Deserialize();

        // Removes the alcaltel phone
        list.remove(6);
        // Adds in a new Phone
        Phone p8 = new Phone("Google", "Pixel 5", 64, 12.2, 6.0, true, 500);
        list.add(p8);

        // Serializes the changed list with the new Phone then Desializes it
        Serialize(list);
        list = Deserialize();

        new Main(list);
	}
}
