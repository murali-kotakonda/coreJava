package ds.collections.HashSetEx;

import java.util.HashSet;
import java.util.Set;

public class TestStringContains2 {
	public static void main(String[] args) {
		ex2();
		
	}

	private static void ex2() {
		Set<String> names = new HashSet<>();
		String x= "user1";
		names.add(x);

		String y ="user1";
		if(names.contains(y)){
			System.out.println("y exists");
		}else{
			System.out.println("y doesnt exists");
		}
	}

	private static void ex1() {
		Person p1 = new Person(1, "user1", 29);
		Person p2 = new Person(1, "user1", 29);
		
		Set<Person> persons = new HashSet<>();
		persons.add(p1);
		persons.add(p2);

		System.out.println(persons.size());
	}
}
