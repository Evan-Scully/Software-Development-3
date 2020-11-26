import java.io.Serializable;

public class FullTimeEmployee implements Employee,Serializable {

    private double rate = 12.00;
    private double hours;
    private String name;
    private String clockIn;

    public FullTimeEmployee(double hours, String name, String clockIn)
    {
        this.hours = hours;
        this.name = name;
        this.clockIn = clockIn;
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

}
