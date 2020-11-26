package ArrayListExample;

import java.util.ArrayList;


public class ArrayListExample {
	private ArrayList<Person> theListofPeople = new ArrayList();
	
	public ArrayListExample(){
		theListofPeople.add(new Person("Michael", 877654321, "Dublin"));
		theListofPeople.add(new Person("Mary", 87123467, "Cork"));
		theListofPeople.add(new Person("Claire", 879654123, "Westmeath"));
		theListofPeople.add(new Person("John", 876541237, "Galway"));
	}
	
	public Person getRefForName(String pName){
		//Because an ArrayList doesn't store tagged value
		//pairs you have to search the list for the customer
		for(Person p:theListofPeople){
			if (p.getName().equals(pName)){
				return p;
			}
		}
		return null;		
	}
}

