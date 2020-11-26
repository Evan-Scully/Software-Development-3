import java.util.ArrayList;

public class ArrayListExample {
	private ArrayList<Student> theListofStudents = new ArrayList();
	
	public ArrayListExample(){
		theListofStudents.add(new Student("1", "Mary", "Software"));
		theListofStudents.add(new Student("2", "John", "Sport"));
		theListofStudents.add(new Student("3", "Adam", "Medicine"));
		theListofStudents.add(new Student("4", "Evan", "Business"));
	}
	
	public Student getRefbyId(String  id){
		for(Student s:theListofStudents){
			if (s.getId().equals(id)){
				return s;
			}
		}
		return null;		
	}
}

