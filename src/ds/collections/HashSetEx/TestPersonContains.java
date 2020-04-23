package ds.collections.HashSetEx;

import java.util.HashSet;
import java.util.Set;

public class TestPersonContains {
	public static void main(String[] args) {

		//ex1();
		ex2();
		
	}

	private static void ex2() {
		Set<Person> persons = new HashSet<>();
		Person p1 = new Person(1, "user1", 29);
		persons.add(p1);

		Person p2 = new Person(1, "user1", 29);
		if(persons.contains(p2)){
			System.out.println("p2 exists");
		}else{
			System.out.println("p2 doesnt exists");
		}
	}

	private static void ex1() {
		Person p1 = new Person(1, "user1", 29);
		Person p2 = new Person(1, "user1", 29);
		
		Set<Person> persons = new HashSet<>();
		persons.add(p1);
		persons.add(p2);

		System.out.println(persons.size());
		for(Person p: persons) {
			System.out.println(p);
		}
	}
}
