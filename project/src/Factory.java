import java.rmi.RemoteException;

public class Factory {

    public Employee createEmployee(double hours, String name, String clockIn) throws RemoteException
    {
    	// Creates different types of employees based on hours worked
        if(hours > 20)
        {
            return new FullTimeEmployee(hours,name,clockIn);
        }
        else if(hours > 10)
        {
            return new PartTimeEmployee(hours,name,clockIn);
        }
        else
        {
            return new TemporaryEmployee(hours,name,clockIn);
        }
    }
}
