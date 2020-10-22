import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Coffee a = new Coffee("Ground");
        Coffee b = new Coffee("Pod");

        try {
			FileOutputStream fileOut = new FileOutputStream("Coffee.ser");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(a);
			objectOut.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
        }
        
        try {
			FileInputStream fileIn = new FileInputStream("Coffee.ser");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			Coffee c = (Coffee) objectIn.readObject();
			objectIn.close();
			System.out.println(c.getType());
			
		}catch (FileNotFoundException e){
		e.printStackTrace();	
		}
    }
}
