import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Coffee extends UnicastRemoteObject implements Serializable,CoffeeInterface
{
    String type;

    public Coffee(String t) throws RemoteException
    {
        this.type = t;
    }

    public void setType(String t)
    {
        this.type = t;
    }

    public String getType()
    {
        return this.type;
    }
}