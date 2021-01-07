package Q2;

public interface Pet {
    public String getType(); 

    public String getPetName(); 

    public void setType(String type); 

    public void setPetName(String name); 
}


/*
Interface's serve a different function than abstract classes. Firstly you can implement 
multiple interface's at the same time. It just declares to the class that implements it
what methods it must inherit. 
*/