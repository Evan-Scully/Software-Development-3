package Q1;

public abstract class Person 
{
    protected abstract void setName(String name);

    protected abstract void setAddress(String address);

    protected abstract void setAge(int age);

    public abstract String getName();
    
    public abstract String getAddress();
    
    public abstract int getAge();
}