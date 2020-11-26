import javax.lang.model.util.ElementScanner6;

public class Factory {
    
    public Employee createEmployee(double hours, String name, String clockIn)
    {
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
