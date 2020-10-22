import java.rmi.Naming;

public class CoffeeClient {

	public static void main(String[] args) {

		String url="rmi:///"; //no IP address, this is local.
		
		try {
			CoffeeInterface coffee_one = (CoffeeInterface) Naming.lookup("Ground");
			String groundOwner = coffee_one.getType();
			CoffeeInterface coffee_two = (CoffeeInterface)Naming.lookup("Pod");
			String podOwner = coffee_two.getType();
			System.out.println("bungalow owned by: " + groundOwner);
			System.out.println("dormer owned by: " + podOwner);
					
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
