package ArrayListExample;

public class Tester {
	public static void main(String[] args){
		ArrayListExample aList = new ArrayListExample();
		Person p = aList.getRefForName("Mary");
		
		p.printDetails();
	}
}



