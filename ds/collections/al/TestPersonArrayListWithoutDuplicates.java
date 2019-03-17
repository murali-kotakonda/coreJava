package ds.collections.al;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestPersonArrayListWithoutDuplicates {
	public static void main(String[] args) {
		// 1. input size
		Scanner sc = new Scanner(System.in);
		// 2. create string array
		List<Person> persons = new ArrayList<Person>();
		// input name for size number of times
		String inputCh = null;

		int counter =1;
		do {
			System.out.println("Enter Details for Person:"+(counter++));

			// read the inputs
			System.out.println("Enter name:");
			String name = sc.next();

			System.out.println("Enter id:");
			int id = sc.nextInt();

			// create obj and keep the input inside the obj
			Person person = new Person();
			person.setId(id);
			person.setName(name);
			
			if (!persons.contains(person)) {
				persons.add(person);
			}
			
			System.out.println("DO you want to contiue(yes/no??");
			inputCh = sc.next();
		} while (inputCh.equalsIgnoreCase("yes"));

		
		for(Person p : persons ){
			System.out.println(p);
		}
	}
}
