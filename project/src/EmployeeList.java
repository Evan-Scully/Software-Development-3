import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class EmployeeList extends UnicastRemoteObject implements EmployeeListInterface {
	
    /**
     *
     */
    private static final long serialVersionUID = 8829865351455325123L;
    private ArrayList<Employee> employees;
    
	public EmployeeList() throws RemoteException {
		employees = new ArrayList<Employee>();
	}

	@Override
	public void addToList(Employee h) throws RemoteException {
		employees.add(h);
	}

	@Override
	public ArrayList<Employee> getList() throws RemoteException {
		return employees;
	}

}
