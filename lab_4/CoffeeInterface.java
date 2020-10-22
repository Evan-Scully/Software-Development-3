import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CoffeeInterface extends Remote{
	public String getType() throws RemoteException;
}
