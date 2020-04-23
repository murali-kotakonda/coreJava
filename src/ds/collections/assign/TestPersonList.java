package ds.collections.assign;

import java.util.ArrayList;
import java.util.Scanner;

import ds.collections.al.Person;

public class TestPersonList {

	Scanner sc = new Scanner(System.in);
	ArrayList<Person> names = new ArrayList<>();

	public void prefer() {
		while (true) {
			System.out.println("enter name ");
			String input = sc.nextLine();
			System.out.println("enter age ");
			int age = sc.nextInt();
			System.out.println("enter id");
			int id = sc.nextInt();
			Person p = new Person(input, age, id);
			names.add(p);
			System.out.println("Do yo wish to continue type yes or no? ");
			String input2 = sc.nextLine();
			if (input2.equalsIgnoreCase("yes")) {
				continue;
			} else {
				for (Person n : names) {
					System.out.println(n.getName() + " " + n.getId() + " " + n.getAge());
				}
				break;
			}
		}

	}
}
