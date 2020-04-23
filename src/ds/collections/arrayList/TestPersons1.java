package ds.collections.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestPersons1 {
	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();

		Person p1 = new Person(1000, "user1", 27);
		Person p2 = new Person(1001, "user2", 28);
		Person p3 = new Person(1002, "user3", 29);
		
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		
		System.out.println("Entered persons ARE :");
		for (Person p : persons) {
			System.out.println(p);
		}
	}
}
