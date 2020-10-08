public class House{

    String surname_owners;
    int number_of_bathrooms;
    int number_of_bedrooms;

    public House()
    {
        surname_owners = null;
        number_of_bathrooms = 0;
        number_of_bedrooms = 0;
    }

    public House(String name, int bathrooms, int bedrooms)
    {
        this.surname_owners = name;
        this.number_of_bathrooms = bathrooms;
        this.number_of_bedrooms = bedrooms;
    }

    public String get_name()
    {
        return this.surname_owners;
    }

    public int get_bathrooms()
    {
        return this.number_of_bathrooms;
    }

    public int get_bedrooms()
    {
        return this.number_of_bedrooms;
    }

    public void set_name(String name)
    {
        this.surname_owners = name;
    }

    public void set_bathrooms(int bathrooms)
    {
        this.number_of_bathrooms = bathrooms;
    }

    public void set_bedrooms(int bedrooms)
    {
        this.number_of_bedrooms = bedrooms;
    }

    public String printDetails()
    {
        return "Owners: " + surname_owners + " No. of bedrooms: " + number_of_bedrooms + " No. Of Bathrooms: " + number_of_bathrooms;
    }

    public static void main (String [] args)
    {
        House a = new House("Smith",1,5);
        House b = new House("Jones",1,3);
        House c = new House();
        c.set_name("Burke");
        c.set_bedrooms(4);
        c.set_bathrooms(2);
        System.out.println(a.printDetails());
        System.out.println(b.printDetails());
        System.out.println(c.printDetails());
    }
}