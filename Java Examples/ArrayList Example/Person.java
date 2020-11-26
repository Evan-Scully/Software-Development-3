package ArrayListExample;

public class Person {
	
	private String name;
	private String address;
	private long phoneNumber;
	
	public Person(){
		this.name=null;
		this.address = null;
		this.phoneNumber = 0;
	}
	
	public Person(String name,long number, String address ){
		this.name=name;
		this.address = address;
		this.phoneNumber = number;
	}
	
	public void setName(String n){
		this.name=n;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void printDetails(){
		System.out.println("name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("**********************************");
	}
}
