import java.rmi.*;
import java.util.ArrayList;

interface EmployeeListInterface extends Remote{
	
	public void addToList(Employee h) throws RemoteException;
	
	public ArrayList<Employee> getList() throws RemoteException;
	
}
