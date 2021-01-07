import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Tester {

    public Tester()
    {

    }

    // Serializes an arraylist into a .ser file
    public void Serialize(ArrayList<Employee> list) throws IOException {
        try {
            FileOutputStream fileOut = new FileOutputStream("Employee.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            for (int i = 0; i < list.size(); i++) {
                objectOut.writeObject(list.get(i));
            }
            objectOut.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Takes a .ser file and deserializes it into an arraylist
    public ArrayList<Employee> Deserialize() throws IOException, ClassNotFoundException {

        ArrayList<Employee> list2 = new ArrayList<Employee>();
                    
        FileInputStream fileIn = new FileInputStream("Employee.ser");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);

        try {

            while(true) {
                Employee newEmployee = (Employee) objectIn.readObject();
                list2.add(newEmployee);
            }
        } catch (EOFException e) {
            System.out.println("All objects have been read in");
        }
        objectIn.close();
        return list2;
    }
    
    
    public static void main (String [] args) throws ClassNotFoundException, IOException
    {

        // Arraylist of objects of full time, part-time and temporary employees
        // Factory decideds on creation which type an employee is based on hours worked
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        Tester s = new Tester();
        Factory f = new Factory();
        

        // First time running puts all this information into the ser file
        
        Employee e1 = f.createEmployee(30, "Evan Scully", "0001");
        Employee e2 = f.createEmployee(20, "Jack Fortune", "0002");
        Employee e3 = f.createEmployee(38, "Patrick Johnson", "0003");
        Employee e4 = f.createEmployee(12, "John Doe", "0004");
        Employee e5 = f.createEmployee(25, "Wendy Obulor", "0005");

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        
        s.Serialize(employeeList);
        
        

        employeeList = s.Deserialize();
        new Gui(employeeList,s);
    }
}
