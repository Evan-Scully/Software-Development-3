import java.rmi.Naming;
import java.rmi.*;
public class CoffeeServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Server has started.....");
		
		try {
			Coffee ground = new Coffee("Ground");
			//System.out.println("bungalow created....");
			Coffee pod = new Coffee("Pod");
			//System.out.println("dormer created...");
			//Naming.rebind(name, obj);
			Naming.rebind("Ground", ground);
			Naming.rebind("Pod", pod);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
