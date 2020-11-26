import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Staff s1 = new Staff("12345", "John Burke", "Dublin", 50000);
		Staff s2 = new Staff("12346", "Mary Smith", "Athlone", 75000);
		House h1 = new House(1,4);
		House h2 = new House(2,2);

		try {
			//Deserializing
			FileInputStream fileIn = new FileInputStream("staffAndHouse.ser");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			//the order they are read (here) MUST be the same in which they're written - see below
			Staff newStaff = (Staff) objectIn.readObject();
			Staff newStaff2 = (Staff) objectIn.readObject();
			House newHouse = (House) objectIn.readObject();
			House newHouse2 = (House) objectIn.readObject();
			//any errors about "unable to cast Staff object to House" or vice versa means
			//the objects are not being read in the order they are written!
			objectIn.close();
			System.out.println(newStaff.getName() + " " + newStaff.getAddress());
			System.out.println(newStaff2.getName() + " " + newStaff2.getAddress());
			System.out.println(newHouse.getNumBedrooms() + " " + newHouse.getNumBathrooms());
			System.out.println(newHouse2.getNumBedrooms() + " " + newHouse2.getNumBathrooms());

		}catch (FileNotFoundException e){
			System.out.println("Sorry file is not available... will create one!");

			//Serializing
			FileOutputStream fileOut = new FileOutputStream("staffAndHouse.ser");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			//the order they're written (here) is VERY important....
			objectOut.writeObject(s1);
			objectOut.writeObject(s2);
			objectOut.writeObject(h1);
			objectOut.writeObject(h2);
			
			objectOut.close();
			//e.printStackTrace();	
		}
	}
}
