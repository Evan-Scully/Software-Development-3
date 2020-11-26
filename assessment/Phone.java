import java.io.Serializable;

public class Phone implements Serializable {
    
    private String make, model;
    private int memory, price;
    private double camera, screen_size;
    private boolean smart;

    public Phone(String make, String model, int memory, double camera, double screen_size, boolean smart, int price)
    {
        this.make = make;
        this.model = model;
        this.memory = memory;
        this.camera = camera;
        this.screen_size = screen_size;
        this.price = price;
        this.smart = smart;
    }

    public String toString()
    {
        return "Make: " + this.make + " Model: " +this.model + " Memory: " + this.memory + " Camera: " + this.camera + " Screen Size: " + this.screen_size +
        " Price: "+ this.price + " Smart: " + this.smart;
    }
}
