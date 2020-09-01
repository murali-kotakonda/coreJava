package ds.collections.hashseteX2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class TestPersonEnd {
	public static void main(String[] args) {
		Set<Person> persons = new HashSet<Person>();
		Scanner sc = new Scanner(System.in);
		// input string till 'END' is encountered
		// 3. input the names
		System.out.println("Enter person names and type END to stop :");
		while (true) {
			System.out.println("Enter name :");
			String name = sc.next();
			
			if ("END".equals(name)) {
				break;
			}
			
			System.out.println("Enter id :");
			int id = sc.nextInt();
			
			System.out.println("Enter age :");
			int age = sc.nextInt();
			
			Person per = new Person(id, name , age);
			persons.add(per);
		}

		System.out.println("*************persons are::***************");

		for (Person p : persons) {
			System.out.println(p);
		}
	}
}
