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
        Child c3 = new Child("Nigel", "Dublin", 4, "Fish", "Goldie");

        Adult a1 = new Adult("Darren", "Louth", 23, "Motorbike", 2, "Cat", "Lily");
        Adult a2 = new Adult("Warren", "Cork", 45, "Var", 4, "Snake", "Slither");
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
            System.out.println(returnedPeople.get(i).getName() + "\n");
        }
    }
}
