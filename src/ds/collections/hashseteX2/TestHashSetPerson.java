package ds.collections.hashseteX2;

import java.util.HashSet;
import java.util.Set;

public class TestHashSetPerson {
	public static void main(String[] args) {
		// ex1();
		ex2();
	}

	private static void ex1() {
		Set<Person> persons = new HashSet<Person>();

		Person p1 = new Person(123, "user5", 45);
		persons.add(p1);

		Person p2 = new Person(123, "user5", 45);
		persons.add(p2);

		Person p5 = new Person(124, "user5", 45);
		persons.add(p5);
		
		System.out.println(persons.size());
		
		for(Person p: persons) {
			System.out.println(p);
		}

		Person p3 = new Person(123, "user5", 46);
		System.out.println(persons.contains(p3));

		Person p4 = new Person(123, "user9", 46);
		System.out.println(persons.contains(p4));

		p4.setName("user5");
		System.out.println(persons.contains(p4));

		// System.out.println(persons.contains(p2));

		/*
		 * Person p3 = new Person(124, "user6", 44);
		 * System.out.println(persons.contains(p3));
		 */
	}

	private static void ex2() {
		Set<Person> persons = new HashSet<Person>();

		Person p1 = new Person(123, "user5", 45);
		persons.add(p1);
		System.out.println(p1.hashCode());
		System.out.println(persons.contains(p1));

		p1.setName("user6");
		System.out.println(p1.hashCode());
		System.out.println(persons.contains(p1));
	}
}
