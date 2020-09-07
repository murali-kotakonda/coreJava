package ds.collections.hashseteX2;

import java.util.HashSet;
import java.util.Set;

public class TestInterview4 {
	public static void main(String[] args) {
        //create set
		Set<Person> persons = new HashSet<>();
		
		//create obj p1
		Person p1 = new Person(1, "user1", 29);
		
		//add p1
		persons.add(p1);

		//create p2
		Person p2 = new Person(1, "user1", 29);
		
		if(persons.contains(p2)){
			System.out.println("p2 exists");
		}else{
			System.out.println("p2 doesnt exists");
		}
	}
	 
}
