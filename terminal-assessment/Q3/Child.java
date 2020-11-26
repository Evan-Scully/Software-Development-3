package Q3;

import java.io.Serializable;

import Q1.Person;
import Q2.Pet;

public class Child extends Person implements Pet, Serializable{

    // Child variables
    private String name;
    private String address;
    private int age;

    // Pet variables
    private String petType;
    private String petName;

    public Child(String name, String address, int age, String petType, String petName)
    {
        this.name = name;
        this.address = address;
        this.age = age;

        this.petType = petType;
        this.petName = petName;
    }

    @Override
    protected void setName(String name) {
        this.name = name;
    }

    @Override
    protected void setAddress(String address) {
        this.address = address;
    }

    @Override
    protected void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() { 
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public int getAge() {     
        return age;
    }

    public String toString() {
        return "Name: " + getName() + " Address: " + getAddress() + " Age: " + getAge() + "\n" + "Pet: " + getType() +
        " Pet Name: " + getPetName() + "\n";
    }
    
    // Pet implemented methods
    @Override
    public String getType() { 
        return petType;
    }

    @Override
    public String getPetName() {
        return petName;
    }

    @Override
    public void setType(String petType) {
        this.petType = petType;
    }

    @Override
    public void setPetName(String petName) {
        this.petName = petName;
    }
}
