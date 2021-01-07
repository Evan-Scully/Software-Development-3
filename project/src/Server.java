import java.util.ArrayList;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	
	/*
	 * I chose to implement the factory pattern because it most suited my idea
	 * of an employee organizer. You provide the factory all the information on 
	 * the employee and it would then choose which one to make based on the amount
	 * of hours that employee worked. None of the other patterns give the functionality
	 * that this one has, it was simple enough to implement and it has provided great 
	 * results
	 */
	
	
    public static void main(String[] args)
	{
        System.out.println("Server has Started");
            try
            {
            	// Creates .ser if not created
                Tester s = new Tester();
                
                ArrayList<Employee> old_list = s.Deserialize();
                
                EmployeeList employee_list = new EmployeeList();

                // Overrides the list with what was in the .ser file
                for(Employee e : old_list)
                {
                    employee_list.addToList(e);
                }    
                // Binds it in Employees
                Naming.rebind("Employees",employee_list);
                
                System.out.println("Here");
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
}
