import java.net.MalformedURLException;
import java.rmi.*;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args)
	{
		String url = "rmi:///";
		System.out.println("Client has started");
		
		try {	
			System.setProperty("java.rmi.server.hostname","192.168.0.185");
			
			EmployeeListInterface e = (EmployeeListInterface) Naming.lookup(url + "Employees");
			// Casts the server object as a list
			ArrayList<Employee> list = e.getList();
			// Gets the list from the url Employees
			
            Tester s = new Tester();
            // Contains serialize and deserialize methods
            
            // Sends the list into the GUI
		    new Gui(list,s);
		    
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();	
	    }
    }
}
