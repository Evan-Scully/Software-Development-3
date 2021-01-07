import java.rmi.*;
import java.rmi.server.*;

public class TemporaryEmployee extends UnicastRemoteObject implements Employee
{

    private static final long serialVersionUID = -3615421771877362747L;
    public String type;
    private double rate = 10.10;
    private double hours;
    private String name;
    private String clockIn;

    public TemporaryEmployee(double hours, String name, String clockIn) throws RemoteException
    {
        this.hours = hours;
        this.name = name;
        this.clockIn = clockIn;
        this.type = "Temporary Employee";
    }

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public double getHours() {
        return hours;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getClockIn() { 
        return clockIn;
    }

    @Override
    public double getWages() {
        return getHours() * getRate();
    }

    public String print() {
        return type + "\n" + "Name:" + this.name + "\n" + "Hours: " + this.hours + "\n" + "Rate: " + this.rate + "\n" + "Clock-In:" + this.clockIn;
    }

    @Override
    public String getType()
    {
        return this.type;
    }
}

