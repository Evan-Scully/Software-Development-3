import java.rmi.*;

interface Employee extends Remote
{
    // Creates the methods to be implemented in the objects
    public double getRate() throws RemoteException;
    public String getType() throws RemoteException;
    public double getHours() throws RemoteException;
    public String getName() throws RemoteException;
    public String getClockIn() throws RemoteException;
    public double getWages() throws RemoteException;
    public String print() throws RemoteException;
}