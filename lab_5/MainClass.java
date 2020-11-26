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
		
		//Serialize
		
		try {
			FileOutputStream fileOut = new FileOutputStream("staff2.ser");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(s1);
			objectOut.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Deserialize
		
		try {
			FileInputStream fileIn = new FileInputStream("staff2.ser");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			Staff newStaff = (Staff) objectIn.readObject();
			objectIn.close();
			System.out.println(newStaff.getName() + " " + newStaff.getAddress());
			
		}catch (FileNotFoundException e){
		e.printStackTrace();	
		}

	}

}
