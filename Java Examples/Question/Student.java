public class Student {
	
	private String id;
	private String name;
	private String course;
	
	public Student(){
		this.id=null;
		this.name = null;
		this.course = null;
	}
	
	public Student(String id,String name, String course ){
		this.id=id;
		this.name = name;
		this.course = course;
	}
	
	public void setId(String i){
		this.id=i;
	}
	
	public String getId(){
		return this.id;
	}
	
	public void printDetails(){
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Course: " + course);
		System.out.println("**********************************");
	}
}
