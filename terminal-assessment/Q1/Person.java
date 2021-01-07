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

/*
Using getters and setters in java allow a person to conrtrol how the variables are accessed and changed,
they can also have different access levels like get could be public so it could be called anywhere while
set could be private.
*/

/*
Abstract classes are designed so that they can be subclassed. All sub classes must implement the default 
methods. It ensures that all subclasses have to have these methods
They also allow subclasses to have different access methods other than public such as protected.
*/