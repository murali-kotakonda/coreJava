package ds.collections.hashseteX2;

import java.util.HashSet;
import java.util.Set;

public class TestInterview1 {
	public static void main(String[] args) {
		//create hashset
		Set<Person> persons = new HashSet<>();

		//create p1 and add p1
		Person p1 = new Person(123, "user5", 45);
		persons.add(p1);

		//create p2
		Person p2 = new Person(123, "user5", 45);
		
		System.out.println(persons.contains(p1));
		System.out.println(persons.contains(p2)); 
		
	}
}

//returns true p2 is a duplicate of p1,