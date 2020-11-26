package Q3;

import java.io.Serializable;

import Q1.Person;
import Q2.Pet;
import Q2.Vehicle;

public class Adult extends Person implements Vehicle, Pet, Serializable{

    // Adult variables
    private String name;
    private String address;
    private int age;

    // Vehicle variables
    private String vehicleType;
    private int numWheels;

    // Pet variables
    private String petType;
    private String petName;

    // Person constructor and Getters and Setters inherited

    public Adult(String name, String address, int age, String vehicleType, int numWheels, String petType, String petName)
    {
        this.name = name;
        this.address = address;
        this.age = age;

        this.vehicleType = vehicleType;
        this.numWheels = numWheels;

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
    public String getAddress() {
        return address;
    }

    @Override
    public int getAge() {     
        return age;
    }

    @Override
    public String getName() {     
        return name;
    }

    public String toString() {
        return "Name: " + getName() + " Address: " + getAddress() + " Age: " + getAge() + "\n" + "Pet: " + getType() +
        " Pet Name: " + getPetName() + "\n" + "Vehicle: " + getVehicleType() + " No. Wheels: " + getNumWheels() + "\n";
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

    // Vehicle implemented methods
    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setVehicleType(String type) {
        this.vehicleType = type;
    }

    @Override
    public void setNumWheels(int num) {
        this.numWheels = num;
    }
    
}
