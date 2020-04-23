package ds.collections.hashseteX2;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class TestPersonHashset4 {
	public static void main(String[] args) {
		// 1. input size
		Scanner sc = new Scanner(System.in);
		// 2. create string array
		Set<Person> set = new HashSet<Person>();
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

			System.out.println("Enter age:");
			int age = sc.nextInt();

			// create obj and keep the input inside the obj
			Person person = new Person(id,name,age);
			
			set.add(person);
			
			System.out.println("DO you want to contiue(yes/no??");
			inputCh = sc.next();
		} while (inputCh.equalsIgnoreCase("yes"));

		for(Person p : set ){
			System.out.println(p);
		}
	}
}
