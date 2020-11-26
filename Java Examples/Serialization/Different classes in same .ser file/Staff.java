import java.io.Serializable;

public class Staff implements Serializable{
	
	private String staffID;
	private String name;
	private String address;
	private int salary;
	
	
	public Staff(String id, String n, String a, int s) {
		this.staffID=id;
		this.name=n;
		this.address=a;
		this.salary=s;
	}
	
	public String getStaffID() {
		return this.staffID;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	public int getSalary() {
		return this.salary;
	}
}
