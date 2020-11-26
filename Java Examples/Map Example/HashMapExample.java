package MapExample;

import java.util.HashMap;

public class HashMapExample {
	
	private HashMap<String, Person> theListofPeople = new HashMap();
	
	public HashMapExample(){
		
		theListofPeople.put("Michael", new Person("Michael", 877654321, "Dublin"));
		theListofPeople.put("Mary", new Person("Mary", 87123467, "Cork"));
		theListofPeople.put("Claire", new Person("Claire", 879654123, "Westmeath"));
		theListofPeople.put("John", new Person("John", 876541237, "Galway"));
	}
	
	public Person getRefForName(String name){
		// You can use the key to access the object directly without searching
		return theListofPeople.get(name);		
	}
}

