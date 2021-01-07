package Q4;

import Q1.Person;
import Q3.Adult;
import Q3.Child;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) throws ClassNotFoundException, IOException
    {
        Child c1 = new Child("Evan", "Laois", 6,"Dog","Spot");
        Child c2 = new Child("Chloe", "Sligo", 8, "Dog", "Charlie");
        Child c3 = new Child("Nidge", "Dublin", 4, "Fish", "Goldie");

        Adult a1 = new Adult("Darren", "Louth", 23, "Motorbike", 2, "Cat", "Lily");
        Adult a2 = new Adult("Warren", "Cork", 45, "Car", 4, "Snake", "Slither");
        Adult a3 = new Adult("Michael", "Kerry", 33, "Car", 4, "Mouse", "Stuart");

        ArrayList<Person> list = new ArrayList<Person>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(a1);
        list.add(a2);
        list.add(a3);

        for(int i = 0; i < list.size();i++)
        {
            System.out.println(list.get(i).toString());
        }

        /*
        Some of the information is unavailable to print because it wasnt declared in the abstract class Person.
        Java cant see the implemented class methods because they do not belong to the class Person, if the list 
        was either child or adult it would be able to get the vehicle and pet but because that's not the type of
        the list it can't
        */


        /*
        ArrayList<Object> list1 = new ArrayList<Object>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(a1);
        list1.add(a2);
        list1.add(a3);

        for(int i = 0; i < list1.size();i++)
        {
            if(list1.get(i) instanceof Child)
            {
                Child c = (Child) list1.get(i);
                System.out.println(c.getName());
            }
            if(list1.get(i) instanceof Adult)
            {
                Adult c = (Adult) list1.get(i);
                System.out.println(c.getName());
            }
        }
        You can just use a generic object arraylist and cast each item according to a new which object it is, 
        because it is cast as a new object you can use all associated methods with the class
        */

        /*
        c3.setVehicleType("Motorbike");
        c3.setNumWheels(2);

        The reason the above code doesnt work is because the class Child does not implement the
        vehicle class. There is no methods in that class with the names of setVehicleType() and 
        setNumWheels(), the adult class is the only class which inherits them
        */

        // Sereialize
        try {
            FileOutputStream fileOut = new FileOutputStream("Person.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(list.get(0));
            objectOut.writeObject(list.get(3));
            objectOut.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Deserialize
        ArrayList<Person> returnedPeople = new ArrayList<Person>();
                    
        FileInputStream fileIn = new FileInputStream("Person.ser");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);

        try {
            while(true) {
                Person person = (Person) objectIn.readObject();
                returnedPeople.add(person);
            }
        } catch (EOFException e) {
            System.out.println("All objects have been read in");
        }
        objectIn.close();

        for(int i = 0; i < returnedPeople.size();i++)
        {
            System.out.println(returnedPeople.get(i).getName());
        }


        /*
        Java has its own compiler called javac, this is independent from the platform you are running, it will 
        run on any operating system. Javac compliles the .java files into btyecode which then need to be 
        interpreted.
        The .class files in java contain the bytecode which is then run on the JVM. Unlike c++ the .class
        files can be understood by any operating system and not just the same one it was compiled on. The resulting 
        bytecode is non-executable and requires the JVM interpreter. C++ generates an executable file 
        which is platform dependant
        Java has multiple layers it has to go through better running so it is slightly slower than c++
        but the advantage is that it is platform dependance. It consumes more resources from the pc to
        convert to bytecode.
        */
    }
}
